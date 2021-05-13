package com.lupan.HeadFirstDesignMode.chapter5_singleton;

/**
 * TODO 单例模式，线程安全,延迟创建实例对象（第一次调用getInstance()创建），性能与线程不安全的几乎相同
 *
 * @author lupan
 * @version 2016/3/22 0022
 */
public class SingletonPerfect {
    /**
     * 首先控制构造函数类外不能访问
     */
    private SingletonPerfect() {
    }
    //创建一个本身的实例对象
    private static volatile SingletonPerfect instance;
    /**
     * 访问器
     */
    public static SingletonPerfect getInstance(){
        if (instance != null){
            return instance;
        }else {
            //多线程触发错误
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (SingletonPerfect.class) {
                if (instance == null) {
                    instance = new SingletonPerfect();
                }
            }
            return instance;
        }
    }
}
