package third.world.demo.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-03-17 00:29
 **/
@Component
@Aspect
public class Testt {

    @Pointcut("@annotation(third.world.demo.controller.TTest)")
    public void test(){}

    @Before("test()")
    public void testc(JoinPoint joinPoint){
        System.out.println(joinPoint.getArgs().toString());
        System.out.println("cc执行");
    }
}
