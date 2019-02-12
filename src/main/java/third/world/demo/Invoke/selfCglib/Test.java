package third.world.demo.Invoke.selfCglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-10 22:56
 **/
public class Test {

    public static void main(String[] args) throws Throwable{
        UserMapper userMapper = new UserMapperImpl();
        InvocationHandler invocationHandler = new SelfHandler(userMapper);

        UserMapper m = (UserMapper)Proxy.newProxyInstance(userMapper.getClass().getClassLoader(),userMapper.getClass().getInterfaces(),invocationHandler);
        m.update();
    }
}
