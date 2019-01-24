package third.world.demo.component;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import third.world.demo.DemoApplication;
import third.world.demo.MailConfig;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-24 20:13
 **/
@Controller
@RequestMapping("/email")
public class Mail {

    @Autowired
    private JavaMailSender mailSender;



    @GetMapping("/test")
    public void sendSimpleEmail(){
        try {
            JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
            mailSender.setHost("smtp.qq.com");//指定用来发送Email的邮件服务器主机名
            mailSender.setPort(587);//默认端口，标准的SMTP端口
            mailSender.setUsername("594180536@qq.com");//用户名
            mailSender.setPassword("imeamsgbwhzubech");//密码

        System.out.print("cxcx");
        SimpleMailMessage message = new SimpleMailMessage();//消息构造器
        message.setFrom("594180536@qq.com");//发件人
        message.setTo("594180536@qq.com");//收件人
        message.setSubject("Spring Email Test");//主题
        message.setText("hello world!!");//正文
        mailSender.send(message);
        System.out.println("邮件发送完毕");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
