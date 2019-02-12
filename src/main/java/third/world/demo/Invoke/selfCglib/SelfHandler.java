package third.world.demo.Invoke.selfCglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-10 22:52
 **/
public class SelfHandler implements InvocationHandler {
    Object c= null;
    public SelfHandler(Object c){
        this.c = c;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(c,args);
    }
}
