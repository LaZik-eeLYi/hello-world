package com.lupan.ehcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@ContextConfiguration(locations = {"/cache/spring-context.xml"})
public class StudentControllerTest extends AbstractTestNGSpringContextTests {

    @Autowired
    StudentController studentController;

    @Test(priority = 1)
    public void testGet() throws Exception {
        studentController.get();
        studentController.get();
        assertTrue(true);
    }

    @Test(priority = 2)
    public void testSave() throws Exception {
        studentController.save();
        studentController.get();
        studentController.get();
        assertTrue(true);
    }
}