package third.world.demo.netty.thirdTest;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-20 19:33
 **/
public class Server {

    static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

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
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for(;;){
                System.out.println(3);
                System.out.println(br.readLine());
                group.forEach(channel -> {
                    try {
                        System.out.println(br.readLine());
                        channel.writeAndFlush(br.readLine()+"\r\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            }

        }finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();
        }
    }

}
