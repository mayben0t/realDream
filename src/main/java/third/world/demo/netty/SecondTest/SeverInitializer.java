package third.world.demo.netty.SecondTest;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-15 22:59
 **/
public class SeverInitializer extends ChannelInitializer<Channel> {
    @Override
    protected void initChannel(Channel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        pipeline.addLast(new ServerHandler());

    }
}
