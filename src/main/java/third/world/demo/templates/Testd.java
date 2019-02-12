package third.world.demo.templates;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-12 23:17
 **/
public class Testd {

    @authTest
    public void test(){}


    public static void main(String[] args)throws Exception {
        System.out.println(Testd.class.getMethod("test").getAnnotation(authTest.class) instanceof authTest);
    }
}
