package third.world.demo.netty.heartBit;

import io.netty.channel.Channel;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-29 00:13
 **/
public class ChannelInitializer extends io.netty.channel.ChannelInitializer {
    @Override
    protected void initChannel(Channel ch) throws Exception {
        ChannelPipeline channelPipeline = ch.pipeline();
        channelPipeline.addLast(new IdleStateHandler(5,7,10,TimeUnit.SECONDS));
        channelPipeline.addLast(new ServerHandler());
    }
}
