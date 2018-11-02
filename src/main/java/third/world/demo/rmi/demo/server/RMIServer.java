package third.world.demo.rmi.demo.server;

import third.world.demo.rmi.demo.Hello;
import third.world.demo.rmi.demo.HelloImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @program: demo
 * @description: 内部启动RMIService
 * @author: WangX
 * @create: 2018-11-02 23:28
 **/
public class RMIServer {
    public static void main(String[] args){

        Registry registry = null;
        try{

            registry=LocateRegistry.getRegistry();  //从本地拿

            registry.list();
            System.out.println("Register the exist server");//说明已经有RMIService了不需要再创建一个新的了
        }catch (RemoteException re){
            try {
                int port = 33333;   //RMIService监听的接口
                registry = LocateRegistry.createRegistry(port);
                System.out.println("Create Registery Server!"); //创建一个新的RMIService
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        try{
            Hello helloServer = new HelloImpl();
            registry.rebind("HelloServer",helloServer); //HelloServer是对外暴露出的名称
            System.out.println("HelloServer server start!");
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            Thread.sleep(30000); //由于是测试用的因此写在了Main方法中如果正常main执行完毕服务会被关闭，
            // 因此需要sleep一会，正常开发过程中这个部分是启动一个新的线程因此不必担心这个问题
        }catch (InterruptedException e){
            //todo
            e.printStackTrace();
        }
    }
}
