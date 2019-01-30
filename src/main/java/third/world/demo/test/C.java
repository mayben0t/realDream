package third.world.demo.test;


/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2019/1/30
 **/
public class C implements Runnable {
        public synchronized void write(int i){
            System.out.print(i+"\t");
        }


    @Override
    public void run(){

            for(int i=1;i<100;i+=2){
                        write(i);
                }
            }

    public static void main(String[] args) throws Exception {
        Object loc1 = new Object();
        Object loc2 = new Object();
        C c= new C();
        D d= new D();
        Thread thread1 = new Thread(c,"c");
        Thread thread2 = new Thread(d,"d");
       synchronized (loc1){
           thread1.start();
           loc1.wait();
           loc2.notify();
       }
        synchronized (loc2){
            thread2.start();
            loc2.wait();
            loc1.notify();
        }
    }
//    public void write(){
//
//    }

}

class D implements Runnable {


    public synchronized void write(int i){
        System.out.print(i+"\t");
    }

    @Override
    public void run() {
        for(int i=0;i<=100;i+=2){
                write(i);
        }
    }
}
