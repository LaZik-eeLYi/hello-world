package com.lupan.HeadFirstDesignMode.chapter10_state;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/28 0028
 */
public class HasQuarterState extends State {

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter(){
        System.err.println("已经有硬币，不能再投！");
    }

    @Override
    public void ejectQuarter(){
        System.out.println("正在退出硬币。。。");
        this.gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank(){
        System.out.println("你转动了把柄。。。");
        this.gumballMachine.setState(gumballMachine.getSoldState());
    }
}
