package third.world.demo.templates;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-12 22:44
 **/

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface authTest{

}
