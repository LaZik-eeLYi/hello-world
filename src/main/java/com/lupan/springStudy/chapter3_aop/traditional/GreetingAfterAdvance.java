package com.lupan.springStudy.chapter3_aop.traditional;


import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * TODO 后置增强
 *
 * @author lupan
 * @version 2016/4/8 0008
 */
public class GreetingAfterAdvance implements AfterReturningAdvice{
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        String clientName = (String)args[0];
        System.out.println("后置增强：see you next time! Mr."+clientName);
    }
}
