package third.world.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import third.world.demo.interceptor.LoginInterceptor;

/**
 * @program: demo
 * @description: 配置拦截器
 * @author: WangX
 * @create: 2018-11-12 22:11
 **/
public class WebMvcConfig extends WebMvcConfigurerAdapter {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(authInterceptor());
//    }
//
//    @Bean
//    public LoginInterceptor authInterceptor() {
//        return new LoginInterceptor();
//    }
}
