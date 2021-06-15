package com.lupan.springStudy.chapter3_aop.traditional;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * TODO 前置增强
 *
 * @author lupan
 * @version 2015/12/31 0031
 */
public class GreetingBeforeAdvance implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        String clientName = (String)args[0];
        System.out.println("前置增强：How are you! Mr."+clientName);
    }
}
