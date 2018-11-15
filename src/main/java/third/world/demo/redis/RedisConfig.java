package third.world.demo.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

/**
 * @program: demo
 * @description: redis连接
 * @author: WangX
 * @create: 2018-11-15 22:54
 **/
public class RedisConfig {

    @Bean
    public RedisConnectionFactory redisCF(){
        JedisConnectionFactory cf = new JedisConnectionFactory();
        cf.setHostName("redis-server");
        cf.setPort(6379);
        return cf;
    }

}
