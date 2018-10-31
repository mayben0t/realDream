package third.world.demo.webnetty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/10/31
 **/
public class WebClient {
    static final String HOST = System.getProperty("host","127.0.0.1");
    static final int PORT = Integer.parseInt(System.getProperty("port","8083"));
    static final int SIZE = Integer.parseInt(System.getProperty("size","256"));

    //test
    public static void main(String[] args) throws Exception{


        //Configure the client.
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY,true)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    public void initChannel(SocketChannel ch) throws Exception{
                        ChannelPipeline p = ch.pipeline();
                        p.addLast("decoder",new StringDecoder());
                        p.addLast("encoder",new StringEncoder());
                        p.addLast(new WebClientHandler());
                    }
                });

            ChannelFuture future = b.connect(HOST,PORT).sync();
            future.channel().writeAndFlush("Across the grate wall,we can arrive anywhere");
            future.channel().closeFuture().sync();
        }finally {
            group.shutdownGracefully();
        }


    }
}
