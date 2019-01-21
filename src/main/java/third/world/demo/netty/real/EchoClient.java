package third.world.demo.netty.real;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-13 22:37
 **/
public class EchoClient {
    private final String host;
    private final int port;

    public EchoClient(String host,int port){
        this.host = host;
        this.port = port;
    }

    public void start() throws Exception{
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
                    .channel(NioSocketChannel.class)
                    .remoteAddress(new InetSocketAddress("localhost",9000))
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(new EchoClientHandler());
                        }
                    });
            ChannelFuture f = b.connect().sync();
            f.channel().closeFuture().sync();
        }finally {
            group.shutdownGracefully().sync();
        }
    }


    public static void main(String[] args) throws  Exception{
//        if(args.length!=2){
//            System.err.println("Usage: "+EchoClient.class.getSimpleName()+" <host><port>");
//            return;
//        }
        String host = "localhost";
        int port = 9000;
        new EchoClient(host,port).start();
    }
}
