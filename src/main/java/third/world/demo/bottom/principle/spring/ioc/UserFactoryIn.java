package third.world.demo.bottom.principle.spring.ioc;

/**
 * @program: demo
 * @description: 实例化工厂获取bean
 * @author: WangX
 * @create: 2018-11-01 23:03
 **/
public class UserFactoryIn {

    public User getBean(){
        return new User();
    }
}
