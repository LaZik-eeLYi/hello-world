package com.lupan.HeadFirstDesignMode.chapter5_singleton;

/**
 * TODO 线程安全的singleton测试
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public class Main2 {

    public static void main(String[] args) {

        //单线程正常
//        Singleton singleton = Singleton.getInstance();
//        System.out.println(singleton.toString());
//        Singleton singleton2 = Singleton.getInstance();
//        System.out.println(singleton2.toString());


        //多线程存在不再单例情况

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonSynchronized singleton = SingletonSynchronized.getInstance();
                System.out.println(singleton.toString());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonSynchronized singleton = SingletonSynchronized.getInstance();
                System.out.println(singleton.toString());
            }
        });

        thread1.start();
        thread2.start();
    }
}
