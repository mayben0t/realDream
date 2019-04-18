package third.world.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan(value = "third.world.demo.mapper")
@SpringBootApplication
@EnableScheduling
public class DemoApplication {
        static ThreadLocal c = new ThreadLocal();

    public static void main(String[] args) {
//        c.set("c");

        SpringApplication.run(DemoApplication.class, args);
    }
}
