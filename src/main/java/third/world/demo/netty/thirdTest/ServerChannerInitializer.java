package third.world.demo.netty.thirdTest;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.DefaultChannelPipeline;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-20 19:38
 **/
public class ServerChannerInitializer extends ChannelInitializer<Channel> {
    @Override
    protected void initChannel(Channel ch) throws Exception {
        ChannelPipeline channelPipeline = ch.pipeline();

        channelPipeline
                .addLast("encoder",new StringEncoder(CharsetUtil.UTF_8))
                .addLast("decoder",new StringDecoder(CharsetUtil.UTF_8))
                .addLast(new ServerHandler());
    }
}
