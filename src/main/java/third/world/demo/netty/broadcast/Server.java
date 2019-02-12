package third.world.demo.netty.broadcast;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.*;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-28 20:57
 **/
public class Server {
static int s = 0;
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Administrator\\Desktop\\test.txt");
        InputStreamReader in = new InputStreamReader(new FileInputStream(file),"gb2312");
        BufferedReader inc = new BufferedReader(in);
//        in.
        char[] b = new char[1024];

        int x;
        String line;
        while((x=inc.read(b))!=-1){
//            System.out.print(new String(b));
            System.out.println("ccc"+new String(b));
            int index=0;
           while(true){
               index = new String(b).indexOf("所示",index+1);
               if(index>0){
                   index++;
                   s++;
               }
               else {
                   break;
               }
           }
//            System.out.println(line);
//            if(new String(b).equals("的"))
//            {
//                ++s;
//            }
        }
        System.out.println(s);



    }
}
