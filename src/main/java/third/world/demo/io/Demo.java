package third.world.demo.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-03 23:40
 **/
public class Demo {
    private static void mkfile() throws Exception{
        File txt = new File("E:/io.txt");
        FileOutputStream stream = new FileOutputStream(txt);
        OutputStreamWriter writer = new OutputStreamWriter(stream,"utf-8");
        writer.write("测试文本");
        writer.close();
    }

    public static void main(String[] args) throws Exception{
        mkfile();
    }
}
