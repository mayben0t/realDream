package third.world.demo.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import third.world.demo.DemoApplication;
import third.world.demo.model.User;

import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2018-11-17 17:38
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=DemoApplication.class)
@WebAppConfiguration
public class selfTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void test(){
        List<User> temp= userMapper.select(1);
        for(User u:temp){
            System.out.print("xxxxxxxxxxxx "+u.getName()+u.getUserId());
        }
    }
}
