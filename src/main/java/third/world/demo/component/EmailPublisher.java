package third.world.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2019/2/13
 **/
@Component
public class EmailPublisher {

    @Autowired
    private ApplicationContext applicationContext;

    public void publish(String msg,String email){
        applicationContext.publishEvent(new EmailEntity(this,msg,email));
    }
}
