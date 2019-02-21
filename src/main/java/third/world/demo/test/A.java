package third.world.demo.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2019/1/30
 **/
public class A {

    public static void main(String[] args) throws Exception{

        File f = new File("D:\\tools\\xmind");
        System.out.println(get(f));
    }


    public static int get(File f){
        int i=0;
        File[] files = f.listFiles();
        if (files==null){
            return 0;
        }
        for(File e:files){
            if(e.isDirectory()){
                i+=get(e);
            }else {
              i++;
            }
        }
        return i;
    }


}
