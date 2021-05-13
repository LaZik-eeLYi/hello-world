package com.lupan.javaStudy.chapter14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2015/12/4 0004.
 */

@Retention(RetentionPolicy.RUNTIME)//标注注解可以保留多久
@Target(ElementType.METHOD) //指定注解可以修饰的目标
public @interface Testable {

}
