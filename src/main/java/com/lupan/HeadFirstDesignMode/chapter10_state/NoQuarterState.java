package com.lupan.HeadFirstDesignMode.chapter10_state;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/28 0028
 */
public class NoQuarterState extends State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter(){
        System.out.println("你投入了一枚硬币。。。");
        //改变状态
        this.gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter(){
        System.err.println("你没有投入硬币，不能退币。。。");
    }
}
