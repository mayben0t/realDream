package third.world.demo.Invoke.realCglib;

import org.aopalliance.intercept.Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-10 23:06
 **/
public class SelfHandler implements InvocationHandler {
    Object proxyc = null;
    public SelfHandler(Object proxy){
        this.proxyc = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method,Object... args)throws Throwable{
        proxy = proxyc;
        System.out.println("前置逻辑判断");
        Object o = method.invoke(proxyc,args);
        System.out.println("后置逻辑");
        return o;
    }

}
