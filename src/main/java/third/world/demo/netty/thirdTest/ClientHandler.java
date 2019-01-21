package third.world.demo.netty.thirdTest;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-20 21:06
 **/
public class ClientHandler extends SimpleChannelInboundHandler<String> {
    @Override
    public void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        ctx.writeAndFlush(Unpooled.copiedBuffer("cc",CharsetUtil.UTF_8));
//        ctx.writeAndFlush(Unpooled.copiedBuffer(msg,CharsetUtil.UTF_8));
//        System.out.println("client received: "+msg.toString());
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端已经建立");
        ctx.writeAndFlush(Unpooled.copiedBuffer("客户端[ "+ctx.channel().remoteAddress()+" ]已上线",CharsetUtil.UTF_8));
    }
}
