package com.tabwu.springboot_resource_analysis.config;

import com.tabwu.springboot_resource_analysis.condition.ClassOnConditional;
import com.tabwu.springboot_resource_analysis.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {


    @Bean
    //@Conditional(JedisClassConditional.class)
    //根据 方法名 获取 注入的对象
    @ClassOnConditional("redis.clients.jedis.Jedis")
    public User getUser() {
        return new User();
    }
}
