package third.world.demo.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2018-12-18 21:03
 **/
public class HeapOOM {
//    static class OOMObject{}
    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args)throws Throwable{
//        HeapOOM h = new HeapOOM();
//        try {
//            h.stackLeak();
//        }catch (Throwable e){
//            System.out.println("cccccccccccccc stack length:"+h.stackLength);
//            throw e;
//        }
//        List<OOMObject> list = new ArrayList<>();
//        while (true){
//            list.add(new OOMObject());
//        }
String c= "ja";
        String b = new StringBuilder("ja").toString();
        System.out.println(b.intern()==c);
    }
}
