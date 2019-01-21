package third.world.demo.netty.SecondTest;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.HttpObject;
import io.netty.util.CharsetUtil;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-15 23:02
 **/
public class ServerHandler extends SimpleChannelInboundHandler<HttpObject> {


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HttpObject msg) throws Exception {
        System.out.println("haha");
        ctx.writeAndFlush(Unpooled.copiedBuffer("i get it",CharsetUtil.UTF_8));
    }
}
