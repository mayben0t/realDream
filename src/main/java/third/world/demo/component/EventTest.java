package third.world.demo.component;

import org.mapstruct.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2019/2/13
 **/
public class EventTest {

    public static void main(String[] args) throws Exception{
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        EmailPublisher demoPublisher = context.getBean(EmailPublisher.class);
        demoPublisher.publish("张三1","123@qq.com");
        demoPublisher.publish("张三2","123@qq.com");
        demoPublisher.publish("张三3","123@qq.com");
        demoPublisher.publish("张三4","123@qq.com");
        demoPublisher.publish("张三5","123@qq.com");
        context.close();
    }
}
