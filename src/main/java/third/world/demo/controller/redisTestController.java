package third.world.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import third.world.demo.service.redis.service.RedisService;

import javax.servlet.http.Cookie;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2018-11-16 00:06
 **/
@RestController
@RequestMapping(value="/redis")
public class redisTestController {
    @Autowired
    private RedisService redisService;
    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    public String redisTest(){
        StringBuffer sb = new StringBuffer();
        redisService.set("str", "str");
        sb.append("str=").append(redisService.get("str").toString()).append(",");
        redisService.hmSet("hmset","key","val");
        sb.append("hmset=").append(redisService.hmGet("hmset","key")).append(",");
        redisService.lPush("list","val");
        sb.append("list=").append(redisService.lRange("list",0,1).toString()).append(",");
        redisService.add("set","val");
        sb.append("set=").append(redisService.setMembers("set").toString()).append(",");
        redisService.zAdd("zset","val1",1);
        redisService.zAdd("zset","wxxxxxxxxxxxxx",2);
        sb.append("zset=").append(redisService.rangeByScore("zset",1,2)).append(",");

        return sb.toString();
    }


}