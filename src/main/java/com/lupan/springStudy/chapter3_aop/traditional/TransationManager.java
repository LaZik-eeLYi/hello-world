package com.lupan.springStudy.chapter3_aop.traditional;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
import java.sql.SQLException;

/**
 * TODO 异常增强，常用语事务处理
 *
 * @author lupan
 * @version 2016/4/8 0008
 */
public class TransationManager implements ThrowsAdvice {

    /**
     * 异常增强方法
     * @param method 方法对象
     * @param args 方法参数
     * @param target 目标对象
     * @param ex 抛出的异常
     */
    public void afterThrowing(Method method,Object[] args, Object target, Exception ex){
        System.out.println(String.format("%s方法抛出异常，异常信息:%s",method.getName(),ex.getMessage()));
        System.out.println("方法1：事务回滚，事务处理成功！");
    }

    /**
     * 异常增强方法,多个方法时调用方法入参异常树最近的
     * @param method 方法对象
     * @param args 方法参数
     * @param target 目标对象
     * @param ex 抛出的异常
     */
    public void afterThrowing(Method method,Object[] args, Object target, SQLException ex){
        System.out.println(String.format("%s方法抛出异常，异常信息:%s",method.getName(),ex.getMessage()));
        System.out.println("方法2：事务回滚，事务处理成功！");
    }
}
