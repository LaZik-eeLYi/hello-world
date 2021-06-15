package com.lupan.springStudy.chapter3_aop.traditional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.Assert.*;

@ContextConfiguration(locations = {"/springStudy/spring-beans-aop-throwingAdvance.xml"})
public class TransationManagerTest extends AbstractTestNGSpringContextTests {
    @Autowired
    AopService serviceProxy ;

    @Test
    public void test() {
        try {
            serviceProxy.find();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try{
            serviceProxy.get();
        }catch (Exception e){

        }
        assertTrue(true);
    }
}