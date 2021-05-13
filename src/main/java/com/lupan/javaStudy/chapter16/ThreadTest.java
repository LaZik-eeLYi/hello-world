package com.lupan.javaStudy.chapter16;

/**
 * TODO 测试取款
 *
 * @author lupan
 * @version 2016/1/25 0025
 */
public class ThreadTest {

    public static void main(String[] args){
        Account account = new Account(1000);

        Thread thread1 = new Thread(new TakeThread(account));
        thread1.setName("甲");
        Thread thread2 = new Thread(new TakeThread(account));
        thread2.setName("乙");

        thread1.start();
        thread2.start();
    }
}
