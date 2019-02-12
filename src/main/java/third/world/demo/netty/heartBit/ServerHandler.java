package third.world.demo.netty.heartBit;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.handler.timeout.IdleStateHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-29 00:14
 **/
public class ServerHandler  extends ChannelInboundHandlerAdapter {

    static Logger logger = LoggerFactory.getLogger(ServerHandler.class);
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if(evt instanceof IdleStateEvent){
            IdleStateEvent event = (IdleStateEvent)evt;
            switch (event.state()){
                case READER_IDLE:
                    logger.info("读空闲");break;
//                    System.out.println("读空闲");break;
                case WRITER_IDLE:
                    logger.info("写空闲");break;
                case ALL_IDLE:
                    logger.info("全部空闲");break;
//                    System.out.prin
            }

        }
    }
}
