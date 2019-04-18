package third.world.demo.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-13 21:52
 **/
public class FairLock implements Runnable{
    static Lock lock = new ReentrantLock(true);     //公平锁

    @Override
    public void run(){
        for(int i=0;i<100;i++){
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + "占用 i");
            }finally {
                lock.unlock();
            }
        }

    }

    public static void main(String[] args) {
        FairLock fairLock = new FairLock();
        Thread t1 = new Thread(fairLock,"t1");
        Thread t2 = new Thread(fairLock,"t2");
        t1.start();
        t2.start();
    }
}
