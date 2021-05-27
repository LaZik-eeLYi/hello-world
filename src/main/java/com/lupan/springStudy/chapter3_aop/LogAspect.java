package com.lupan.springStudy.chapter3_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * TODO 操作监控日志切面类
 *
 * @author lupan
 * @version 2016/4/6 0006
 */

@Aspect //定义切面类
@Component
public class LogAspect {

    /**
     * 连接点方法正常执行前执行的增强
     * @param joinPoint 连接点
     * @param aopAnnotation 连接点修饰的注解
     */
    @Before("within(com.lupan.springStudy.chapter3_aop.*) && @annotation(aopAnnotation)")
    public void beforeMethod(JoinPoint joinPoint,AopAnnotation aopAnnotation){
          System.out.println("方法执行前执行的增强！");
    }

    /**
     * 连接点方法正常执行返回后执行的增强
     * @param joinPoint 连接点
     * @param aopAnnotation 连接点修饰的注解
     */
    @AfterReturning("within(com.lupan.springStudy.chapter3_aop.*) && @annotation(aopAnnotation)")
    public void addLog(JoinPoint joinPoint,AopAnnotation aopAnnotation){
        Object[] args = joinPoint.getArgs();
        System.out.println("方法参数："+args.toString());

        Signature signature = joinPoint.getSignature();
        System.out.println("方法全标识："+signature.toString());
        System.out.println("方法名："+signature.getName());

        System.out.println("方法执行的操作："+aopAnnotation.methodDescription());

        System.out.println("添加操作日志成功！");
    }

    /**
     * 连接点方法抛出异常后执行的增强
     * @param joinPoint 连接点
     * @param aopAnnotation 连接点修饰的注解
     * @param exception 绑定抛出的异常
     */
    @AfterThrowing(pointcut = "within(com.lupan.springStudy.chapter3_aop.*) && @annotation(aopAnnotation)",throwing = "exception")
    public void addExceptionLog(JoinPoint joinPoint,AopAnnotation aopAnnotation,Exception exception){
        Object[] args = joinPoint.getArgs();
        System.out.println("方法参数："+args.toString());

        Signature signature = joinPoint.getSignature();
        System.out.println("方法全标识："+signature.toString());
        System.out.println("方法名："+signature.getName());

        System.out.println("方法执行的操作："+aopAnnotation.methodDescription());

        System.err.println("方法抛出的异常：" + exception.getMessage());

        System.out.println("添加异常日志成功！");
    }


}
