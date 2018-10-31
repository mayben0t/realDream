package third.world.demo.webnetty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/10/31
 **/
public class NettyTest extends SimpleChannelInboundHandler<String> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String o) throws Exception {

    }
}
