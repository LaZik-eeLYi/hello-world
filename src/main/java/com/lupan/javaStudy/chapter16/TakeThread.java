package com.lupan.javaStudy.chapter16;

/**
 * TODO 取钱线程
 *
 * @author lupan
 * @version 2016/1/25 0025
 */
public class TakeThread implements Runnable{

    //单次取款额度
    private final int TAKEA_MOUNT = 800;
    //账户
    private Account account;

    public TakeThread(){

    }

    public TakeThread(Account account){
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public void run(){

//        synchronized (account){


//        if(account.getBalance()-TAKEA_MOUNT < 0){
//            System.out.println(Thread.currentThread().getName()+":余额不足，不能取钱！");
//        }else{
//
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//                account.setBalance(account.getBalance() - TAKEA_MOUNT);
//
//            System.out.println(Thread.currentThread().getName()+":取钱成功，余额为："+account.getBalance());
//
//        }

//        }

        this.account.take();

    }
}
