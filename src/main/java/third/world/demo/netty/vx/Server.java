package third.world.demo.netty.vx;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-14 23:52
 **/
public class Server {

    public static void main(String[] args)throws Exception{

    }


    public void start() throws Exception{
        final ServerChannelHandler serverChannelHandler = new ServerChannelHandler();
        EventLoopGroup group = new NioEventLoopGroup();
//        try {
//            Server
//        }
    }
}
