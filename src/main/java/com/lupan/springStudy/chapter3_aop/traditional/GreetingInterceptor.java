package com.lupan.springStudy.chapter3_aop.traditional;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * TODO 环绕增强（方法拦截器）
 *
 * @author lupan
 * @version 2016/4/8 0008
 */
public class GreetingInterceptor implements MethodInterceptor{
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        String clientName = (String)invocation.getArguments()[0];
        System.out.println("方法前代码！");
        Object result = invocation.proceed();
        System.out.println("方法后代码！");
        return result;
    }
}
