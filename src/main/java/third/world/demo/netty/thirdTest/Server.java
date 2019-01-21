package third.world.demo.netty.thirdTest;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-20 19:33
 **/
public class Server {

    public static void main(String[] args) throws Exception{
        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup worker = new NioEventLoopGroup();

        try{
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(boss,worker)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ServerChannerInitializer());

            ChannelFuture channelFuture = serverBootstrap.bind(8089).sync();
            channelFuture.channel().closeFuture().sync();

        }finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();
        }
    }

}
