package third.world.demo.netty.heartBit;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-29 00:08
 **/
public class Server {

    public static void main(String[] args) throws Exception{
        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup work = new NioEventLoopGroup();
        try {

            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(boss, work)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer());

            ChannelFuture channelFuture = serverBootstrap.bind(8089);
            channelFuture.channel().closeFuture().sync();
        }finally {
            work.shutdownGracefully();
            boss.shutdownGracefully();
        }
    }
}
