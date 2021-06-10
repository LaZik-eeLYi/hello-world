package com.lupan.javaStudy.chapter18.dynamicProxy;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/4/7 0007
 */
public class RunDog implements Dog {

    @Override
    public String info() {
        System.out.println("我是一条狗！");
        return null;
    }

    @Override
    public String run() {
        System.out.println("我在跑！");
        return null;
    }
}
