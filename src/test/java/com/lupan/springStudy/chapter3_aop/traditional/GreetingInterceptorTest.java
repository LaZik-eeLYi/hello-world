package com.lupan.springStudy.chapter3_aop.traditional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@ContextConfiguration(locations = {"/springStudy/spring-beans-aop-aroundAdvance.xml"})
public class GreetingInterceptorTest extends AbstractTestNGSpringContextTests{

    @Autowired
    Waiter waiterProxy;

    @Test
    public void test(){
        waiterProxy.greetTo("lupan");
        assertTrue(true);
    }

}