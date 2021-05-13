package com.lupan.javaStudy.chapter18;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * TODO java反射机制测试
 *
 * @author lupan
 * @version 2016/2/15 0015
 */

@SuppressWarnings("unchecked")
@Deprecated
public class ClassTest {

    private String name;
    public String age;

    private ClassTest(){};
    private ClassTest(String name){};

    public void info(){
        System.out.println("无参数的info方法");
    }

    public void info(String str){
        System.out.println("有参数的info方法，str="+str);
    }

    class Inner{

    }

    public static void main(String[] args) throws Exception{
        Class<ClassTest> clazz = ClassTest.class;
        Constructor[] cs = clazz.getDeclaredConstructors();
        System.out.println("全部构造方法如下：");
        for (Constructor c : cs) {
            System.out.println(c);
        }

        Constructor[] pcs = clazz.getConstructors();
        System.out.println("公共构造方法如下：");
        for (Constructor c : pcs) {
            System.out.println(c);
        }

        Method[] ms = clazz.getDeclaredMethods();
        System.out.println("全部方法如下：");
        for(Method m : ms){
            System.out.println(m);
        }

        Method[] pms = clazz.getMethods();
        System.out.println("public方法如下：");
        for(Method m : pms){
            System.out.println(m);
        }

        System.out.println("info方法如下：");
        Method m = clazz.getMethod("info",String.class);
        System.out.println(m);

        System.out.println("所有的注解如下：");
        Annotation[] as = clazz.getAnnotations();
        for (Annotation a : as){
            System.out.println(a);
        }

        System.out.println("所有的内部类如下：");
        Class[] cls = clazz.getDeclaredClasses();
        for (Class c : cls){
            System.out.println(c);
        }

        Field[] fs = clazz.getDeclaredFields();
        System.out.println("所有的属性如下：");
        for (Field f:fs){
            System.out.println(f.getName());
        }

        //  加载内部类
//        Class innerClass = Class.forName("ClassTest$Inner");
//        System.out.println("inner对应的外部类为："+innerClass.getDeclaringClass());

        System.out.println("clazz的包："+clazz.getPackage());
        System.out.println("clazz的父类："+clazz.getSuperclass());
    }
}
