package third.world.demo.io;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import third.world.demo.dto.ResultTO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2019/1/10
 **/
@RestController
public class FileUpload {

    @GetMapping("/upfile")
    public ResultTO fileUp(@RequestParam MultipartFile file){
        String uuid = UUID.randomUUID().toString().trim();
        String fileN=file.getOriginalFilename();
        int index=fileN.indexOf(".");
        String fileName=uuid+fileN.substring(index);
        try {
            File fileMkdir=new File("D:\\UpLoadDemo");

            if(!fileMkdir.exists()) {
                fileMkdir.mkdir();
            }
            //定义输出流 将文件保存在D盘    file.getOriginalFilename()为获得文件的名字
            FileOutputStream os = new FileOutputStream(fileMkdir.getPath()+"\\"+fileName);
            InputStream in = file.getInputStream();
            int b = 0;
            while((b=in.read())!=-1){ //读取文件
                os.write(b);
            }
            os.flush(); //关闭流
            in.close();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultTO();
    }
}
