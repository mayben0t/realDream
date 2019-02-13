package third.world.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class Hello {
    private Logger logger = LoggerFactory.getLogger(Hello.class);

    @Autowired
    WebApplicationContext webApplicationContext;

    static int x;

    @Value("${testValue}")
    private Integer test;

    @RequestMapping("/hello")
    public void hello(){
//    logger.info("this is log");
//        return "hello world";
        ServletContext s= webApplicationContext.getServletContext();
        System.out.println(s.getContextPath());
    }

    class test implements FactoryBean{
        @Override
        public Object getObject() throws Exception {
            return null;
        }

        @Override
        public boolean isSingleton() {
            return false;
        }

        @Override
        public Class<?> getObjectType() {
            return null;
        }
    }

    @GetMapping("/cct")
    public Integer ca(){
        return test;
    }
}
