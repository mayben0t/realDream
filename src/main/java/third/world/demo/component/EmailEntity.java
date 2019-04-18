package third.world.demo.component;

import org.springframework.context.ApplicationEvent;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static void main(String[] args) throws Exception {
        List c = new ArrayList(1);
        Field f = c.getClass().getDeclaredField("size");
        f.setAccessible(true);
        System.out.println(f.toString());
        System.out.println(f.getInt(c));
    }
}









class wo<T_T>{}  class ni{}

class zz<T_T>{

    public void test(){
        ArrayList n = new ArrayList(16);
    }

    wo<T_T > le(ni ne){return null;}

}