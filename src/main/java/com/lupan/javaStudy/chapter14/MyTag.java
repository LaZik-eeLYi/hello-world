package com.lupan.javaStudy.chapter14;

/**
 * Created by Administrator on 2015/12/4 0004.
 */
public @interface MyTag {

    String name() default "null";
    int age() default 18;
}
