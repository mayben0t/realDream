package third.world.demo.netty;

import java.util.UUID;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-14 22:18
 **/
public class UserX {

    private String name;

    private String password;

    int i;

    public UserX() {
    }

    public UserX(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.name.equals(((UserX)obj).getName())){
            return true;
        }
        return false;
    }
}
