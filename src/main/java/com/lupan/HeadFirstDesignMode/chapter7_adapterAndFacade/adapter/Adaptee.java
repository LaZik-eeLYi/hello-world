package com.lupan.HeadFirstDesignMode.chapter7_adapterAndFacade.adapter;

/**
 * TODO 被适配者
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public class Adaptee implements IAdaptee {
    @Override
    public void printFiveA() {
        System.out.println("aaaaa");
    }

    @Override
    public void printThreeB() {
        System.out.println("bbb");
    }
}
