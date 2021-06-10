package com.lupan.ehcache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 基础知识
 * 1)JoinP oint
 *  java.lang.Object[] getArgs()：获取连接点方法运行时的入参列表；
 *  Signature getSignature() ：获取连接点的方法签名对象；
 *  java.lang.Object getTarget() ：获取连接点所在的目标对象；
 *  java.lang.Object getThis() ：获取代理对象本身；
 * 2)ProceedingJoinPoint
 * ProceedingJoinPoint继承JoinPoint子接口，它新增了两个用于执行连接点方法的方法：
 *  java.lang.Object proceed() throws java.lang.Throwable：通过反射执行目标对象的连接点处的方法；
 *  java.lang.Object proceed(java.lang.Object[] args) throws java.lang.Throwable：通过反射执行目标对象连接点处的方法，不过使用新的入参替换原来的入参。
 */

/**
 * TODO 用于aop编程切面类，处理cache相关
 *
 * @author lupan
 * @version 2016/4/6 0006
 */

@Aspect //定义切面类
@Component
public class CatcheAspect {

    private static Logger logger = LoggerFactory.getLogger(CatcheAspect.class);
    private static final String STUDENT_CACHE = "studentCache";

    private Cache cache;

    public CatcheAspect(){
        logger.info("初始化cache。。。");
        logger.debug("初始化cache。。。");
        logger.debug("1、读取spring配置文件。。。");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cache/spring-context.xml");
        CacheManager cacheManager = (CacheManager)applicationContext.getBean("cacheManager");
        cacheManager.addCache(STUDENT_CACHE);
        logger.debug("2、创建cache实例。。。");
        this.cache = cacheManager.getCache(STUDENT_CACHE);
    }

    /**
     * 连接点方法正常执行前执行的增强
     * @param proceedingJoinPoint 连接点
     * @param catcheAnnotation 连接点修饰的注解
     */
    @Around("within(com.lupan.ehcache.*) && @annotation(catcheAnnotation)")
    public Object interceptor(ProceedingJoinPoint proceedingJoinPoint,CacheAnnotation catcheAnnotation) throws Throwable {

        CacheOperation operationType = catcheAnnotation.operation();
        String cacheElementKey = catcheAnnotation.cacheElementKey();

        logger.debug("拦截到方法："+proceedingJoinPoint.getSignature().getName());

        //判断是否需要读取缓存
        if(operationType==CacheOperation.READ){
            //yes判断缓存有无
            if(this.cache.get(cacheElementKey)!=null){
               //yes返回缓存的内容，方法不用执行
                logger.debug("已有缓存，直接返回缓存："+cacheElementKey);
                return cache.get(cacheElementKey).getObjectValue();
            }else{
                //no执行方法，将结果插入缓存
                Object result = proceedingJoinPoint.proceed();
                Element element = new Element(cacheElementKey,result);
                cache.put(element);
                logger.debug("无缓存，创建新缓存："+cacheElementKey);
                return result;
            }
        }else if(operationType==CacheOperation.UPDATE){
            //no如果是更新操作的话清除缓存
            Object result = proceedingJoinPoint.proceed();
            cache.remove(cacheElementKey);
            logger.debug("更新操作，删除缓存："+cacheElementKey);
            return result;
        }else{
            //如果是其他直接调用方法返回
            logger.debug("其余操作，不操作缓存。。。");
            return proceedingJoinPoint.proceed();
        }
    }
}
