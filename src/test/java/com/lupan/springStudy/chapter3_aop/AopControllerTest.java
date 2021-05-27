package com.lupan.springStudy.chapter3_aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@ContextConfiguration(locations = {"/springStudy/spring-context.xml"})
public class AopControllerTest extends AbstractTestNGSpringContextTests{

    @Autowired
    private AopController aopController;

    @Test
    public void testSave() throws Exception {
        aopController.save();
        assertTrue(true);
    }

    @Test
    public void testDelete() throws Exception {
        aopController.delete();
        assertTrue(true);
    }
}