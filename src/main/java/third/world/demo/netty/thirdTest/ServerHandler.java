package third.world.demo.netty.thirdTest;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-20 20:16
 **/
public class ServerHandler extends SimpleChannelInboundHandler<String> {
    @Override
    public void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
//        System.out.println("尽力了");
//        ctx.writeAndFlush(msg);
        System.out.println("来自[ "+ctx.channel().remoteAddress()+" ]:"+msg);
    }

//    @Override
//    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//        System.out.println("尽力了");
//        super.channelRead(ctx, msg);
//        ByteBuf in = (ByteBuf) msg;
//        System.out.println("Server received:"+in.toString(CharsetUtil.UTF_8));
//        ctx.write(in);
//    }
}
