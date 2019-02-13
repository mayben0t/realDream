package third.world.demo.component;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2019/2/13
 **/
@Component
public class EmailListener implements ApplicationListener<EmailEntity> {

    @Async
    @Override
    public void onApplicationEvent(EmailEntity event) {
        System.out.println("注册成功,邮件内容:"+event.getMsg()+",邮箱地址为:"+event.getEmail());
    }
}
