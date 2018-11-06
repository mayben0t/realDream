package third.world.demo.bottom.principle.spring.ioc;

/**
 * 创建Bean的三种方式
 * 1.调用class的无参构造
 * 2.静态工厂
 * 3.实例工厂
 */


/**
 * @program: demo
 * @description: ioc testClass
 * @author: WangX
 * @create: 2018-11-01 21:56
 **/

//属性注入的三种方式：1.set 2.构造 3.接口注入(spring不支持)

public class User {
    private String userName;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void add(){
        System.out.print("add...");
    }
}
