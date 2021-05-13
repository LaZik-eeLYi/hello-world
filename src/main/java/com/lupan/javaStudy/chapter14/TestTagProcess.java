package com.lupan.javaStudy.chapter14;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2015/12/4 0004.
 */
public class TestTagProcess {

    public static void process(String clazz) throws ClassNotFoundException{
        int passed = 0;
        int failed = 0;

        for (Method m : Class.forName(clazz).getMethods()) {

            //如果包含TestTable注解
            if (m.isAnnotationPresent(Testable.class)) {
                try {
                    m.invoke(null);
                    passed++;
                } catch (Exception e) {
                    System.out.println(m+"方法运行异常，异常信息:"+e.getMessage());
                    failed++;
                }
            }
        }

        //统计测试结果
          System.out.println("共运行了"+(failed+passed)+"个方法，成功："+passed+"个；失败："+failed+"个！");
    }


    public static void main(String[] args) throws ClassNotFoundException {
        TestTagProcess.process("com.lupan.javaStudy.chapter14.MyTest");
    }
}
