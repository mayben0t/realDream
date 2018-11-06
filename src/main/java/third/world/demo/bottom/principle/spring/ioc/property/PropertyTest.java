package third.world.demo.bottom.principle.spring.ioc.property;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2018-11-06 12:30
 **/
public class PropertyTest {

    @Test
    public void propertyTest(){
            ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
            Person  p = (Person)ctx.getBean("person");
            System.out.println(p.getName());
    }
}
