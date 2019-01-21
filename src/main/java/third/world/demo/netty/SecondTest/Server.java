package third.world.demo.netty.SecondTest;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-15 22:51
 **/
public class Server {


    public static void main(String[] args) throws Exception{
        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup worker = new NioEventLoopGroup();
        try{
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(boss,worker)
                .channel(NioServerSocketChannel.class)
                .childHandler(new SeverInitializer());
        ChannelFuture channelFuture = serverBootstrap.bind(8900).sync();
        channelFuture.channel().closeFuture().sync();}
        finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();
        }
    }
}
