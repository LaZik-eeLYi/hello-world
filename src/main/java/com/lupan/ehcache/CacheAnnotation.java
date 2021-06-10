package com.lupan.ehcache;

import java.lang.annotation.*;

/**
 * TODO 用于aop编程的注解,用于标识方法返回值会被缓存，下次调用直接调用缓存中的数据
 *
 * @author lupan
 * @version 2016/4/6 0006
 */
@Target({ElementType.METHOD}) //注解修饰目标
@Retention(RetentionPolicy.RUNTIME) //注解保留到时机
@Documented //会被javaDoc工具提取
@Inherited //修饰类时其子类自动拥有此注解
public @interface CacheAnnotation {
    //注解属性
    String value() default "";
    //标识存入cache的elementKey
    String cacheElementKey() default "";
    //对cache的操作
    CacheOperation operation();
}
