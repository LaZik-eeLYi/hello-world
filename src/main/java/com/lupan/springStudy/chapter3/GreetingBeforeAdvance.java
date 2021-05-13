package com.lupan.springStudy.chapter3;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author lupan
 * @version 2015/12/31 0031
 */
public class GreetingBeforeAdvance implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        String clientName = (String)args[0];
        System.out.println("How are you! Mr."+clientName);
    }
}
