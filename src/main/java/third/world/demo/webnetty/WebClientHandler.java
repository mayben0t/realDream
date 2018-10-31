package third.world.demo.webnetty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/10/31
 **/
public class WebClientHandler extends ChannelInboundHandlerAdapter{
//    Logger logger = LoggerFactory.getLogger(WebClientHandler.class);

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//        System.out.println("");
        System.out.println("WebClientHandler Active");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//        logger.info("WebClientHandler read Message");
        System.out.println("WebClientHandler read Message:"+msg);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }


}
