package third.world.demo.bottom.principle.spring.ioc.classLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-28 19:54
 **/
public class ClassInit {

    public static Map m = new HashMap(){{
        m.put("a","2");
    }};

    public static void main(String[] args) {
//        Map m1 = this.m;
//        System.out.println(m.get("cc"));
        Integer i = (Integer)m.get("a");
        System.out.println(i);
    }
}
