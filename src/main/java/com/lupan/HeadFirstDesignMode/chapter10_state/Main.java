package com.lupan.HeadFirstDesignMode.chapter10_state;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/28 0028
 */
public class Main {

    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(100);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();
    }
}
