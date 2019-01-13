package third.world.demo.netty.one;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-10 00:46
 **/
public class OldServer {
    static int portNumber = 8099;

    public static void main(String[] args)throws Exception{
        ServerSocket serverSocket = new ServerSocket(portNumber);
        Socket clientSocket = serverSocket.accept();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
        String request , response;
        while((request=in.readLine())!=null){
            if("Done".equals(request)){
                break;
            }
//            response =
//            out.println(response);
        }

    }
}
