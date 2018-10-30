package third.world.demo.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

@Target({ElementType.METHOD, ElementType.TYPE})     //表示该注解可用在方法以及类上
@Retention(RetentionPolicy.RUNTIME)                 //表示这是一个运行时注解,即运行起来之后,才获取注解中的相关信息,而不像@Override那样不运行,在编译时就可以进行相关工作的编译时注解
@Inherited                                           //表示可以被子类继承
@Documented                                          //表示当执行javadoc时,本注解会生成相关文档
public @interface DBconnect {
    String ip();
    int port() default 3306;
    String database();
    String encoding();
    String loginName();
    String password();
}
