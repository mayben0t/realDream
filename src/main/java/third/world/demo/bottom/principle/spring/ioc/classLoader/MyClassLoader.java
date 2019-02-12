package third.world.demo.bottom.principle.spring.ioc.classLoader;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-27 15:23
 **/
public class MyClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        return super.findClass(name);
    }
}
