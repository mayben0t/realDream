package third.world.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    private Logger logger = LoggerFactory.getLogger(Hello.class);

    @RequestMapping("/hello")
    public String hello(){
    logger.info("this is log");
        return "hello world";
    }
}
