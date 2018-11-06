package third.world.demo.bottom.principle.spring.ioc.Difficult;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2018-11-06 16:53
 **/
public class Diff {

    private String[] arr;

    private List list;

    private Map map;

    private Properties properties;

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(HashMap map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }


    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Diff d = (Diff)ac.getBean("diff");
//        System.out.println(d.arr);
        for(String a:d.arr){
            System.out.println(a);
        }
        System.out.println(d.list);
        System.out.println(d.map);
        System.out.println(d.properties);
    }
}
