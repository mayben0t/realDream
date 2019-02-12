package third.world.demo.Invoke.cglib;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-10 21:36
 **/
public class Person implements Subject {
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    public void miai() {
        System.out.println(name + "正在相亲中。。。");
    }

}