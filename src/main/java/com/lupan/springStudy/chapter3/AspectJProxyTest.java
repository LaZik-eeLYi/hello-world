package com.lupan.springStudy.chapter3;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.testng.log4testng.Logger;

/**
 * TODO AspectJProxyTest测试
 *
 * @author lupan
 * @version 2016/1/11 0011
 */
public class AspectJProxyTest {

    public static void main(String args[]){

        Logger logger = Logger.getLogger(AspectJProxyTest.class);

        logger.info("开始增强！");
        Waiter target = new NaiveWaiter();
        AspectJProxyFactory factory = new AspectJProxyFactory();

        factory.setTarget(target);
        factory.addAspect(PreGreetingAspect.class);
        Waiter proxy = factory.getProxy();

        logger.info("增强完成！");

        proxy.greetTo("lupan");
        proxy.serveTo("lupan");
    }

}
