package com.lupan.javaStudy.chapter14;

/**
 * Created by Administrator on 2015/12/4 0004.
 */
public class MyTest {


    public static void f1(){
        System.out.println("方法1");
    }

    @Testable
    public static void f2(){
        System.out.println("方法2");
        throw new RuntimeException("运行异常");
    }

    @Testable
    public static void f3(){
        System.out.println("方法3");
    }

    @Testable
    public static void f4(){
        System.out.println("方法4");
        throw new RuntimeException("运行异常");
    }
}
