package third.world.demo.test;

import third.world.demo.Invoke.Run;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2019/1/30
 **/

class Num{
    int i=1;
    boolean flag=false;
}
class AA implements Runnable {
    Num num;

    public Num getNum() {
        return num;
    }

    public void setNum(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (num.i<100){
            synchronized (num){
                if(num.flag){
                    try {
                        num.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println(num.i);
                    num.i+=1;
                    num.flag=true;
                    num.notify();
                }
            }
        }
    }
}

class BB implements Runnable{
    Num num;

    public Num getNum() {
        return num;
    }

    public void setNum(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (num.i<=100){
            synchronized (num){
                if(!num.flag){
                    try {
                        num.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println(num.i);
                    num.i+=1;
                    num.flag=false;
                    num.notify();
                }
            }
        }
    }
}

public class DD {

    public static void main(String[] args) {
        Num num = new Num();
        AA a = new AA();
        BB b = new BB();
        a.num=num;
        b.num = num;
        Thread thread1 = new Thread(a,"aa");
        Thread thread2 = new Thread(b,"bb");
        thread1.start();
        thread2.start();

    }
}
