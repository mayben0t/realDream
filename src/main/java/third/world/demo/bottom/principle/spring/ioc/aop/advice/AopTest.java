package third.world.demo.bottom.principle.spring.ioc.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2018-11-12 23:49
 **/
public class AopTest {

    private void before1(){
        System.out.println("前置增强...");
    }

    public void after1(){
        System.out.println("后置通知...");
    }

    public void round1(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("环绕起来了 前...");
        proceedingJoinPoint.proceed();
        System.out.println("环绕起来了 后...");
    }
}
