package com.lupan.springStudy.chapter2_ioc;

import com.lupan.springStudy.common.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO spring上下文容器ApplicationContext,此类提供对BeanFactory的封装
 *
 * @author lupan
 * @version 2016/4/6 0006
 */
public class ApplicationContextMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springStudy/spring-beans-ioc.xml");
        Student student = applicationContext.getBean("student", Student.class);

        System.out.println(student.getNum()+"号"+student.getName());
    }
}
