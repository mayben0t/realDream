package third.world.demo.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2018-11-14 23:27
 **/
@Component
@Aspect
public class auth {

    @Pointcut("execution(* third.world.demo.service.UserService.select(..))")
    public void real(){}

    @Before("real()")
    public void validate(){
        System.out.println("xxxxxxxxxxxxxxxxxx验证成功");
    }
}
