package third.world.demo.templates;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-12 21:25
 **/
public class Demo {


    public static void main(String[] args) throws Exception {
        Thread t1  = new Thread(new A());
        Thread t2  = new Thread(new B());
        Thread t3  = new Thread(new C());
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}

class A implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("A");
        }
    }
}
class B implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("B");
        }
    }
}
class C implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("C");
        }
    }
}
