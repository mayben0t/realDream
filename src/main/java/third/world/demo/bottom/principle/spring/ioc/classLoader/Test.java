package third.world.demo.bottom.principle.spring.ioc.classLoader;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-27 15:20
 **/
public class Test {

    public static void main(String[] args) {
//        System.out.println(Test.class.getClassLoader());

        ClassLoader c = Test.class.getClassLoader();
        while(c!=null){
//            System.out.println(c.toString());
            c=c.getParent();
        }
//        System.out.println(c);
        System.out.println(new Test().getClass().getClassLoader().getResource("").toString());
    }

}
