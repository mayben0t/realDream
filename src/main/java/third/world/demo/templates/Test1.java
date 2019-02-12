package third.world.demo.templates;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-12 21:52
 **/
public class Test1 {
    public static void main(String[] args) {
        Date t = new Date();
        int i = 1000000000;
        for(int x=0;x<i;x++){
            int c = i;
            c=c+1;
        }

        Date finish = new Date();
        System.out.println(finish.getTime()-t.getTime());
    }
}


