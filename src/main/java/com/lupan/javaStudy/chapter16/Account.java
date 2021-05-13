package com.lupan.javaStudy.chapter16;

import java.util.concurrent.locks.ReentrantLock;

/**
 * TODO 账户pojo
 *
 * @author lupan
 * @version 2016/1/25 0025
 */
public class Account {

    public static final int TAKE_AMOUNT = 800;
    //余额
    private int balance;
    //同步锁
    private final ReentrantLock lock = new ReentrantLock();

    public Account(){

    }

    public Account(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //取钱的方法
    public synchronized void take(){

//        lock.lock();

        try {
            if(this.getBalance()- TAKE_AMOUNT < 0){
                System.out.println(Thread.currentThread().getName()+":余额不足，不能取钱！");
            }else{

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                this.setBalance(this.getBalance() - TAKE_AMOUNT);

                System.out.println(Thread.currentThread().getName()+":取钱成功，余额为："+this.getBalance());

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

//            lock.unlock();
        }

    }
}
