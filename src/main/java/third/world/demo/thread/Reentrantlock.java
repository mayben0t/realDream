package third.world.demo.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-13 20:38
 **/
public class Reentrantlock {


    public static void main(String[] args) {
        Lock k = new ReentrantLock();

        Thread t1 = new Thread(()->{
            k.lock();
            System.out.println("test已拿到k");
//            k.unlock();
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();

        Thread t2 = new Thread(()->{
            try {
//                if(!k.tryLock()){
//                    k.lock();
                    k.lockInterruptibly();
                    System.out.println("打断");
//                }
            }catch (Exception e){
                System.out.println("sad");
                e.printStackTrace();
            }
            k.lock();
            System.out.println("hh已拿到k");
            k.unlock();
        });


        t2.start();
        t2.interrupt();
    }
}
