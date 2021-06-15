package com.lupan.springStudy.chapter2_ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * TODO 基于类的springBean配置，用于初始化逻辑比较复杂的类
 *
 * @author lupan
 * @version 2016/4/8 0008
 */
@Configuration
public class AppConfig {

    @Bean(name="user")
    @Scope("singleton")
    public User user(){
        return new User("001","小明",60.5,1.75);
    }

    @Bean
    @Scope("singleton")
    public Car car(){
        return new Car("002","本田",user());
    }
}
