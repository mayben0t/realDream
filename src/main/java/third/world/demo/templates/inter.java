package third.world.demo.templates;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-12 23:03
 **/
public class inter extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("ccs");
        System.out.println(handler);
//        System.out.println(handler.getClass().getMethod(""));
        if(((HandlerMethod)handler).hasMethodAnnotation(authTest.class)){
            if(request.getParameter("token")==null||request.getParameter("token").equals("")){
                System.out.println("no token");
            }
        }
        return true;
    }
}
