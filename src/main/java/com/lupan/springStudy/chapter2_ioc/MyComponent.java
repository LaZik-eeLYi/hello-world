package com.lupan.springStudy.chapter2_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * TODO 基于注解的bean配置
 *
 * @author lupan
 * @version 2016/4/8 0008
 */
@Component("myComponent")
@Scope("singleton")
@Lazy(true)
public class MyComponent {

//    @Autowired
    private User fuser;

//    @Autowired
//    @Qualifier("car")
    private Car fcar;

    @Autowired(required = false)
    private List<Car> fcarList;

    //启动容器的时候调用
    @Autowired
    public void init(@Qualifier("car")Car car,User user){
        fuser = user;
        fcar = car;
        System.out.println("保存成功！");
    }
}
