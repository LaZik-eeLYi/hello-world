package com.lupan.HeadFirstDesignMode.chapter7_adapterAndFacade.adapter;


/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public class Adapter implements Target{

    private IAdaptee adaptee;

    public Adapter(IAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void printAFive() {
        adaptee.printFiveA();
    }

    @Override
    public void printSixB() {
        System.out.print("bbb");
        adaptee.printThreeB();
    }
}
