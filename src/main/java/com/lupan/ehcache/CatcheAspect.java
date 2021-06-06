package com.lupan.ehcache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/4/6 0006.
 */

@Aspect //定义切面类
@Component
public class CatcheAspect {

    private static final Log logger = LogFactory.getLog(CatcheAspect.class);

    private Cache cache;

    public CatcheAspect(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cache/spring-context.xml");
        CacheManager cacheManager = (CacheManager)applicationContext.getBean("cacheManager");
        cacheManager.addCache("studentCache");

        this.cache = cacheManager.getCache("studentCache");
    }

    /**
     * 连接点方法正常执行前执行的增强
     * @param joinPoint 连接点
     * @param catcheAnnotation 连接点修饰的注解
     */
    @Before("within(com.lupan.ehcache.*) && @annotation(catcheAnnotation)")
    public void beforeMethod(JoinPoint joinPoint,CacheAnnotation catcheAnnotation){

        //判断是否需要读取缓存

            //yes判断缓存有无

                 //yes返回缓存的内容，方法不用执行
                 //no执行方法，将结果插入缓存
            //no如果是更新操作的话更新缓存

        if(catcheAnnotation.cacheElementKey()!=""){
            if(this.cache.get(catcheAnnotation.cacheElementKey())!=null){

            }
//            Element element = new Element(catcheAnnotation.cacheElementKey(),);
        }
        System.out.println("方法执行前执行的增强！");
    }
}
