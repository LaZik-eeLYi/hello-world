package com.lupan.javaStudy.chapter18.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/4/7 0007
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 动态代理对象执行方法时替换的方法
     * @param proxy 动态代理对象
     * @param method target接口方法对象
     * @param args target接口方法参数
     * @return null
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        DogAop.before();
        method.invoke(target,args);
        DogAop.after();
        return null;
    }
}
