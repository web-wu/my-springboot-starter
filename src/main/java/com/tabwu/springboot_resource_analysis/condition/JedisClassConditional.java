package com.tabwu.springboot_resource_analysis.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class JedisClassConditional implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {

        boolean flag = true;

        try {
          //Class.forName("redis.clients.jedis.Jedis");
            Map<String, Object> map = metadata.getAnnotationAttributes(ClassOnConditional.class.getName());
            String[] names = (String[]) map.get("value");

            for (String name : names) {
                Class.forName(name);
            }
        } catch (Exception e) {
            flag = false;
        }

        return flag;
    }
}
