package com.lupan.springStudy.chapter3_aop;

import java.lang.annotation.*;

/**
 * TODO 用于aop编程的注解
 *
 * @author lupan
 * @version 2016/4/6 0006
 */
@Target({ElementType.METHOD}) //注解修饰目标
@Retention(RetentionPolicy.RUNTIME) //注解保留到时机
@Documented //会被javaDoc工具提取
@Inherited //修饰类时其子类自动拥有此注解
public @interface AopAnnotation {
    //注解属性----方法用途
    String methodDescription();
}
