package third.world.demo.Invoke.realCglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-10 23:10
 **/
public class Test {

    public static void main(String[] args) {
        Mapper mapper = new MapperImpl();
        InvocationHandler invocationHandler = new SelfHandler(mapper);
        Mapper m = (Mapper) Proxy.newProxyInstance(Mapper.class.getClassLoader(),mapper.getClass().getInterfaces(),invocationHandler);
        m.update();
    }
}
