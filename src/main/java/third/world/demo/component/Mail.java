package third.world.demo.component;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import third.world.demo.Entitys.EmailObj;

import java.util.Map;
import java.util.Properties;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-24 20:13
 **/
@RestController
@RequestMapping("/email")
public class Mail {

    @GetMapping("/test")
    public String sendSimpleEmail(EmailObj emailObject){
        try {
            // 获取参数
            System.out.println(emailObject.getEmail());
            System.out.println(emailObject.getSubject());
            System.out.println(emailObject.getText());

            JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
            mailSender.setHost("smtp.qq.com");//指定用来发送Email的邮件服务器主机名
            mailSender.setPort(587);//默认端口，标准的SMTP端口
            mailSender.setUsername("1052363946@qq.com");//用户名
            mailSender.setPassword("gmyawiijthpubaii");//密码

            Properties javaMailProperties = new Properties();
            javaMailProperties.put("mail.smtp.auth", true);
            javaMailProperties.put("mail.smtp.starttls.enable", true);
            javaMailProperties.put("mail.smtp.timeout", 5000);
            mailSender.setJavaMailProperties(javaMailProperties);
            // 创建邮件的内容
            System.out.print("发送邮箱测试，来自于" + mailSender.getUsername());
            SimpleMailMessage message = new SimpleMailMessage();//消息构造器
            message.setFrom("1052363946@qq.com");//发件人
            message.setTo(emailObject.getEmail());//收件人
            message.setSubject(emailObject.getSubject());//主题
            message.setText(emailObject.getText());//正文
            mailSender.send(message);
            System.out.println("邮件发送完毕");
            return "成功";
        }catch (Exception e){
            e.printStackTrace();
            return "失败";
        }
    }

}
