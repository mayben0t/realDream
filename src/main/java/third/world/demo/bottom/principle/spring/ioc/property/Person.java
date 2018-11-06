package third.world.demo.bottom.principle.spring.ioc.property;

/**
 * @program: demo
 * @description: ioc property
 * @author: WangX
 * @create: 2018-11-06 12:27
 **/
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
