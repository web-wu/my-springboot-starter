package com.tabwu.springboot_resource_analysis.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(JedisClassConditional.class)
public @interface ClassOnConditional {
    String[] value();
}








