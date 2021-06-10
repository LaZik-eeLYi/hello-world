package com.lupan.javaStudy.chapter18.dynamicProxy;

/**
 * TODO dog类实例的aop增强
 *
 * @author lupan
 * @version 2016/4/7 0007
 */
public class DogAop {

    public static String before() {
        System.out.println("--方法前调用--");
        return null;
    }

    public static String after() {
        System.out.println("--方法后调用--");
        return null;
    }
}
