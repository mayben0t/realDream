package third.world.demo.bottom.principle.spring.ioc.classLoader;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-25 22:32
 **/
public class Demo {

    static{
        temp=2;
    }
    static int temp=1;

    public static void main(String[] args) {
        System.out.printf("%d",temp);
    }
}
