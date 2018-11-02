package third.world.demo.rmi.demo.server;

import com.sun.xml.internal.ws.api.message.Header;
import third.world.demo.rmi.demo.Hello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Handler;

/**
 * @program: demo
 * @description: rmi客户端
 * @author: WangX
 * @create: 2018-11-02 23:42
 **/
public class RMIClient {
    public static void main(String[] args){
        try{

            String hostName = "localhost";  //RMIService的地址 这里是本地执行
            int port = 33333;
            Registry registry = LocateRegistry.getRegistry(hostName,port);

            Hello hello = (Hello)registry.lookup("HelloServer");    //RMIService注册时暴露出来的名称

            String message = hello.sayHello("THIRD WORLD");
            System.out.println(message);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
