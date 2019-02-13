package third.world.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.client.RestTemplate;

@MapperScan(value = "third.world.demo.mapper")
@SpringBootApplication
@EnableCaching
@Configuration
public class DemoApplication {

    @Value("${spring.profiles.active}")
    private String c;

    @Value("${testValue}")
    private Integer test;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        System.out.println(new DemoApplication().c+"         cccccccccccc");
//        System.out.println(new DemoApplication().test+"         cccccccccccc");
    }

    @Bean
    public JavaMailSender JavaMailSenderService(){
        return new JavaMailSenderImpl();
    }

    @Bean
    public MailSender mailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.qq.com");//指定用来发送Email的邮件服务器主机名
        mailSender.setPort(465);//默认端口，标准的SMTP端口
        mailSender.setUsername("594180536@qq.com");//用户名
        return mailSender;
    }

    @Bean
    @Scope("singleton")
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public @interface authTest(){
//        return new authTest();
//    }
}
