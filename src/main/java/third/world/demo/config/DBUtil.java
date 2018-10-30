package third.world.demo.config;

import third.world.demo.annotation.DBconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/10/30
 **/

@DBconnect(ip="127.0.0.1",database = "thirdworld",encoding = "UTF-8",loginName = "root",password = "123456")
public class DBUtil {
    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException,NoSuchMethodException,SecurityException{
        DBconnect dBconnect = DBUtil.class.getAnnotation(DBconnect.class);

        String ip = dBconnect.ip();
        int port  = dBconnect.port();
        String database = dBconnect.database();
        String encoding = dBconnect.encoding();
        String loginName = dBconnect.loginName();
        String passwrod = dBconnect.password();

        String url = String.format("jdbc:mysql://%s:%d/$s?characterEncoding=%s",ip,port,database,encoding);
        return DriverManager.getConnection(url,loginName,passwrod);
    }

    //测试连接
    public static void main(String[] args) throws NoSuchMethodException,SecurityException,SQLException{
        Connection test = getConnection();
        System.out.println(test);
    }
}
