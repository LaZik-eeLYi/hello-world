package com.lupan.springStudy.chapter2_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO 基于类配置的启动
 *
 * @author lupan
 * @version 2016/4/8 0008
 */
public class AppConfigMain {
    public static void main(String[] args){
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = (Car)ctx.getBean("car");
        System.out.println(car);
    }
}
