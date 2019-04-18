package third.world.demo.service.redis.service;

import org.apache.logging.log4j.core.config.Scheduled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-03-17 14:48
 **/
@Service
public class SelfRedis {

    @Autowired
    private RedisTemplate redisTemplate;


    public void test(){
        redisTemplate.opsForValue().append("name3","wx");
    }
    int a=1;
    @org.springframework.scheduling.annotation.Scheduled(cron="0/5 * * * * ?")
    public void tt(){
        System.out.println("开始攻击"+a++);
    }

}
