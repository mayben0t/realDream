package third.world.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import netscape.javascript.JSObject;
import org.springframework.http.HttpEntity;
import org.apache.http.entity.BasicHttpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import third.world.demo.dto.ResultTO;
import third.world.demo.exception.CommonException;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-31 23:21
 **/
@RestController
@RequestMapping("/sms/")
public class SMSController {
    @Autowired
    RestTemplate restTemplate;


    @GetMapping("hope")
    public ResultTO first(String iphone) throws Exception{
        URI uri = new URI("http://api.feige.ee/SmsService/Send");
//        String url  = "http://api.feige.ee/SmsService/Send";
//        HttpHeaders httpHeaders = new HttpHeaders();
        Map m1 = new HashMap();
        m1.put("Account","18795905752");
        m1.put("Pwd","42ff813a72740c1d8de6ccff7");
        m1.put("Content","test短信接口 回复0退订");
        m1.put("Mobile",iphone);
        m1.put("SignId",null);
        JSON js = JSONObject.parseObject(JSON.toJSONString(m1));
        HttpEntity httpEntity = new HttpEntity(js,null);
        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.add("Account","18795905752");
//        httpHeaders.add("Pwd","42ff813a72740c1d8de6ccff7");
//        httpHeaders.add("Content","test短信接口 回复0退订");
//        httpHeaders.add("Mobile",iphone);
//        httpHeaders.add("SignId",null);

        ResponseEntity res =  restTemplate.exchange(uri,HttpMethod.POST,httpEntity,Map.class);
        JSONObject j = JSONObject.parseObject(JSON.toJSONString(res.getBody()));
        if((int)j.get("SuccessCount")>0){
            return new ResultTO("success");
        }
        throw new CommonException("程序异常");
    }
}
