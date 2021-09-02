package com.tabwu.auto_configuration_wujiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class AutoConfigurationWujiuApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AutoConfigurationWujiuApplication.class, args);
        Jedis jedis = (Jedis) context.getBean("wuJedis");

        System.out.println(jedis);


    }

}
