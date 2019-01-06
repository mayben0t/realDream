package third.world.demo.io;

import io.netty.buffer.ByteBuf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-02 23:06
 **/
public class ReadTest {
    public static void main(String[] args) throws Exception{
        String file = "c:/stream.txt";
        String charset = "UTF-8";
        //写字符转换成字节流
        FileOutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter writer = new OutputStreamWriter(outputStream, charset);
        try{
            writer.write("这是要保存的中文字符");
        }finally {
            writer.close();
        }
        //读取字节解码成字符
        FileInputStream inputStream = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(inputStream,charset);
        StringBuffer stringBuffer = new StringBuffer();
        char[] buf = new char[64];
        int count = 0;
        try{
            while((count = reader.read(buf))!= -1){
                stringBuffer.append(buf,0,count);
            }
        }finally {
            reader.close();
        }
        System.out.println(stringBuffer.toString());

        Charset charset1 = Charset.forName("utf-8");
        String s = "我是测试文字";
        ByteBuffer c = charset1.encode(s);
        CharBuffer ca = charset1.decode(c);
        System.out.println(c.toString());
        System.out.println(ca.toString());
    }
}
