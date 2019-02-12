package third.world.demo.templates;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.Element;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-12 22:29
 **/
@RestController
public class Authc {
    @authTest
    @GetMapping("/jujus")
    public String test(){
        return "hha";
    }
}



