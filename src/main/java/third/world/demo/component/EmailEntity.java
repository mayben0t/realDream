package third.world.demo.component;

import org.springframework.context.ApplicationEvent;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2019/2/13
 **/
public class EmailEntity extends ApplicationEvent {
    private String email;
    private String msg;


    public EmailEntity(Object source,String msg,String email){
        super(source);
        this.msg=msg;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
