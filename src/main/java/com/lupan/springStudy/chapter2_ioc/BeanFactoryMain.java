package com.lupan.springStudy.chapter2_ioc;

import com.lupan.springStudy.common.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * TODO  ioc容器BeanFactory
 *
 * @author lupan
 * @version 2016/4/6 0006
 */
public class BeanFactoryMain {
    public static void main(String[] args){
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Resource resource = resourcePatternResolver.getResource("springStudy/spring-beans-ioc.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Student student = beanFactory.getBean("student",Student.class);

        System.out.println(student.getNum()+"号"+student.getName());
    }
}
