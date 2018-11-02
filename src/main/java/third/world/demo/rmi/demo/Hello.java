package third.world.demo.rmi.demo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @program: demo
 * @description: class extends Remote
 * @author: WangX
 * @create: 2018-11-02 23:22
 **/
public interface Hello extends Remote {
    String sayHello(String name) throws RemoteException;
}
