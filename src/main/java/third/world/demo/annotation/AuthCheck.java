package third.world.demo.annotation;

import java.lang.annotation.*;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/11/12
 **/
@Target(ElementType.METHOD)                 //用于方法之上
@Retention(RetentionPolicy.RUNTIME)         //运行时检查
@Documented
public @interface AuthCheck {
}
