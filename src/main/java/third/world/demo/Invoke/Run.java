package third.world.demo.Invoke;

import java.lang.reflect.Method;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/12/12
 **/
public class Run {

    public static void main(String[] args) throws Exception{
        Class c = Person.class;
        Object o = c.newInstance();
        Method m1 = c.getMethod("getName");

        System.out.println((String)m1.invoke(o));
        Person p = new Person();
        p.setName("wang");
        System.out.println((String)m1.invoke(p));
    }
}
