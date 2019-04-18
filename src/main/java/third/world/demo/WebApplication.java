package third.world.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import third.world.demo.templates.inter;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-12 23:01
 **/
@Configuration
public class WebApplication implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new inter()).addPathPatterns("/*");
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
