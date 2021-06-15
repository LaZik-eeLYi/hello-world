package com.lupan.springStudy.chapter2_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@ContextConfiguration(locations = {"/springStudy/spring-context1.xml"})
public class MyComponentTest extends AbstractTestNGSpringContextTests {

    @Autowired
    MyComponent myComponent;

    @Test
    public void testSave() throws Exception {
        System.out.println(myComponent.toString());
    }
}