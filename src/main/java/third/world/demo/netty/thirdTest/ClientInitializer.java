package third.world.demo.netty.thirdTest;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-20 21:04
 **/
public class ClientInitializer extends ChannelInitializer {

    @Override
    protected void initChannel(Channel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast("encoder",new StringEncoder(CharsetUtil.UTF_8));
        pipeline.addLast("Decoder",new StringDecoder(CharsetUtil.UTF_8));
        pipeline.addLast(new ClientHandler());
    }
}
