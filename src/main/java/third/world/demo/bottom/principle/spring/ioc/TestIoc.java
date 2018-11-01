package third.world.demo.bottom.principle.spring.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * @program: demo
 * @description: ioc test
 * @author: WangX
 * @create: 2018-11-01 22:12
 **/
public class TestIoc {
    ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void testUser(){

        User user = (User)context.getBean("user");
        Assert.state(user!=null);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testFactory(){
        User anoUser = (User)context.getBean("anoUser");
        System.out.println(anoUser);
        anoUser.add();
    }
}
