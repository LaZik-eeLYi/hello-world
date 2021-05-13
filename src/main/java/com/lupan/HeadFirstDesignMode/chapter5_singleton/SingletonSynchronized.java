package com.lupan.HeadFirstDesignMode.chapter5_singleton;

/**
 * TODO 单例模式，线程安全,延迟创建实例对象（第一次调用getInstance()创建），性能是不安全的1%
 *
 * @author lupan
 * @version 2016/3/22 0022
 */
public class SingletonSynchronized {
    /**
     * 首先控制构造函数类外不能访问
     */
    private SingletonSynchronized() {
    }
    //创建一个本身的实例对象
    private static SingletonSynchronized instance;
    /**
     * 访问器
     */
    public static synchronized SingletonSynchronized getInstance(){
        System.out.println("进入方法");
        if (instance != null){
            System.out.println("退出方法2");
            return instance;
        }else {

            //多线程触发错误（解决）
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingletonSynchronized();
            System.out.println("退出方法1");
            return instance;
        }
    }
}
