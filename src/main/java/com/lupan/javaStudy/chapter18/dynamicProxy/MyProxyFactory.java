package com.lupan.javaStudy.chapter18.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * TODO 生成动态代理的工厂
 *
 * @author lupan
 * @version 2016/4/7 0007
 */
public class MyProxyFactory {

    /**
     * 获取目标对象的动态代理对象
     * @param target 目标对象
     * @return 动态代理对象
     */
    public static Object getProxy(Object target){
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setTarget(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),myInvocationHandler);
    }
}
