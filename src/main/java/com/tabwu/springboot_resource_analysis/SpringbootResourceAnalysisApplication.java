package com.tabwu.springboot_resource_analysis;

import com.tabwu.springboot_resource_analysis.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootResourceAnalysisApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootResourceAnalysisApplication.class, args);

        User user = (User) context.getBean("getUser");

        System.out.println(user);
    }
}
