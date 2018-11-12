package third.world.demo.interceptor;

import org.junit.platform.commons.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import third.world.demo.annotation.AuthCheck;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/11/12
 **/
public class LoginInterceptor implements HandlerInterceptor {


    /**
     * preHandle在执行Controller之前执行，返回true，则继续执行Contorller
     * 返回false则请求中断。
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //token校验
        AuthCheck authCheck;
        if(handler instanceof HandlerMethod){
            authCheck = ((HandlerMethod)handler).getMethodAnnotation(AuthCheck.class);
        }else {
            return true;
        }
        //这里处理业务逻辑
        //有注解的地方需要登陆校验
        String authToken = "";
        if(authCheck!=null){
            authToken = request.getParameter("authToken");
            if(StringUtils.isBlank(authToken)){
                throw new
            }
        }
    }

    /**
     * postHandle是在请求执行完，但渲染ModelAndView返回之前执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * afterCompletion是在整个请求执行完毕后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
