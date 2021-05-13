package com.lupan.HeadFirstDesignMode.chapter7_adapterAndFacade.adapter;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public class Main {
    public static void main(String[] args){
        Target target = new Adapter(new Adaptee());
        target.printAFive();
        target.printSixB();
    }
}
