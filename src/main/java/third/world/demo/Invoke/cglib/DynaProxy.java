package third.world.demo.Invoke.cglib;

import org.aopalliance.intercept.Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-10 21:37
 **/
public class DynaProxy implements InvocationHandler {
    private Object target; // 被代理对象

    public DynaProxy(Object target) {
        super();
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        System.out.println("前置逻辑");
        obj = method.invoke(target,args);
        System.out.println("后置逻辑");
        return obj;
    }
}
