package third.world.demo.bottom.principle.spring.ioc.aop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2018-11-13 00:05
 **/
public class TestAop {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        NormalService normalService = (NormalService)applicationContext.getBean("normalService");
        normalService.add();
    }
}
