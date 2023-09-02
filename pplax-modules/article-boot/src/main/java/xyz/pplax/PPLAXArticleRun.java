package xyz.pplax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author qsyyke
 * @date Created in 2022/5/11 14:38
 */


@EnableFeignClients
@SpringBootApplication
public class PPLAXArticleRun {
    public static void main(String[] args) {
        SpringApplication.run(PPLAXArticleRun.class, args);
    }
}
