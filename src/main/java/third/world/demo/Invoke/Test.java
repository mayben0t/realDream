package third.world.demo.Invoke;

import java.lang.reflect.Method;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-05 23:32
 **/
public class Test {

    public static void main(String[] args) throws Exception{
        Class d  = Demo.class;
        Method m1 = d.getMethod("print",String.class);
        m1.invoke(new Demo(),"ss");
        Object ds = d.newInstance();
        Demo ssa = (Demo) ds;
        ssa.print("cccas");
    }
}

class Demo{
    public void print(String c){
        System.out.println(c.toUpperCase());
    }
}
