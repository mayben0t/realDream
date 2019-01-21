package third.world.demo.netty.thirdTest;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoop;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-20 20:46
 **/
public class Client {

    public static void main(String[] args) throws Exception {
        EventLoopGroup work = new NioEventLoopGroup();

        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(work)
                    .channel(NioSocketChannel.class)
                    .handler(new ClientInitializer());


            Channel channel = bootstrap.connect("localhost",8089).sync().channel();
//            channelFuture.channel().closeFuture().sync();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for(;;){
                channel.writeAndFlush(br.readLine()+"\r\n");
            }
        }finally {
            work.shutdownGracefully();
        }


    }
}
