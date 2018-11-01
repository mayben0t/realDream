package third.world.demo.bottom.principle.spring.ioc;

/**
 * @program: demo
 * @description: ioc static factory
 * @author: WangX
 * @create: 2018-11-01 22:46
 **/
public class UserFactory {

    public static User getBean(){
        return new User();
    }
}
