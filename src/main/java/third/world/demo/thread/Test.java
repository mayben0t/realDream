package third.world.demo.thread;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-16 14:12
 **/
public class Test {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
//        list.add("sdd");
        System.out.println(get(4));
    }


    public static int get(int n){

        if(n==1){
            return 1;
        }else
            return n*get(n-1);
    }

}
