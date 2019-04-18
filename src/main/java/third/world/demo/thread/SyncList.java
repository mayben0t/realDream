package third.world.demo.thread;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-13 22:36
 **/
public class SyncList {
    private LinkedList list = new LinkedList();
    final static int MAX_VALUE = 10;
    public synchronized void add(Object o){
        while(list.size()==MAX_VALUE){      //用while不用if
            try {
                this.wait();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        list.add(o);
        this.notifyAll();
    }
    public synchronized Object get(){
        while(list.size()<=0){
            try {
                this.wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return list.removeFirst();
    }

    public static void main(String[] args) {
        SyncList syncList = new SyncList();

        for(int i=0;i<2;i++){
            Thread t = new Thread(new Thread(){
                @Override
                public void run(){
                    while (true){
                    syncList.add("生产消息");}
                }
            },"proc"+i);
            t.start();
        }

        for(int i=0;i<10;i++){
            Thread t1 = new Thread(new Thread(){
                @Override
                public void run(){
                    while (true) {
                        System.out.println(syncList.get());
                    }
                }
            },"消费者"+i);
            t1.start();
        }


    }

}
