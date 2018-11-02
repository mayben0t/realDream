package third.world.demo.rmi.demo;

import java.io.Serializable;
import java.rmi.RemoteException;

/**
 * @program: demo
 * @description: 实现类
 * @author: WangX
 * @create: 2018-11-02 23:24
 **/
public class HelloImpl implements Hello,Serializable {
    @Override
    public String sayHello(String name) throws RemoteException {
        return "across the grate wall, "+name+" can arrive at every conner in the world!";
    }
}
