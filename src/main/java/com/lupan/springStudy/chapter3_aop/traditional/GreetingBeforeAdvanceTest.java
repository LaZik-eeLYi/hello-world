package com.lupan.springStudy.chapter3_aop.traditional;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;


public class GreetingBeforeAdvanceTest {

    public static void main(String args[]) throws Exception {
        Waiter target = new NaiveWaiter();
        MethodBeforeAdvice advice = new GreetingBeforeAdvance();
        AfterReturningAdvice afterReturningAdvice = new GreetingAfterAdvance();
        ProxyFactory proxyFactory = new ProxyFactory();
        //设置代理的目标类
        proxyFactory.setTarget(target);
        proxyFactory.addAdvice(advice);
        proxyFactory.addAdvice(afterReturningAdvice);

        Waiter proxy = (Waiter) proxyFactory.getProxy();
        proxy.greetTo("lupan");
        proxy.serveTo("lupan");
    }
}

