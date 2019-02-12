package third.world.demo.Invoke.cglib;

import java.lang.reflect.Proxy;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-10 21:45
 **/
public class Test {

    public static void main(String[] args) {
        Person p = new Person("zz");
        DynaProxy dynaProxy = new DynaProxy(p);
        // Proxy 提供用于创建动态代理类和实例的静态方法，它还是由这些方法创建的所有动态代理类的超类。
        // 动态生成代理对象（类加载器，被代理接口，InvocationHandler）
        Subject s=(Subject)Proxy.newProxyInstance(p.getClass().getClassLoader(), p.getClass()
                .getInterfaces(), dynaProxy);
        s.miai();
    }
}
