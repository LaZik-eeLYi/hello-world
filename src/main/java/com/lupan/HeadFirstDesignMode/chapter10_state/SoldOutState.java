package com.lupan.HeadFirstDesignMode.chapter10_state;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/28 0028
 */
public class SoldOutState extends State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
}
