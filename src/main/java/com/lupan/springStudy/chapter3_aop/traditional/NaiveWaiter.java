package com.lupan.springStudy.chapter3_aop.traditional;

/**
 * TODO
 *
 * @author lupan
 * @version 2015/12/31 0031
 */
public class NaiveWaiter implements Waiter {

    @Override
    public void greetTo(String name) {
        System.out.println("greet to "+name+"....");
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serve to "+name+"....");
    }
}
