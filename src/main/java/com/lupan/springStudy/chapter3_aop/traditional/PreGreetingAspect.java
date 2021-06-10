package com.lupan.springStudy.chapter3_aop.traditional;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * TODO 基于aspectJ的切面编程
 *
 * @author lupan
 * @version 2016/1/11 0011
 */

@Aspect
public class PreGreetingAspect {

    @Before("execution(* greetTo(..))")
    public void beforeGreeting(){
       System.out.println("How are you!");
    }
}
