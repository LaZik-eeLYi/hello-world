package com.lupan.HeadFirstDesignMode.chapter10_state;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/28 0028
 */
public class SoldState extends State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void dispense(){
        this.gumballMachine.releaseBall();
        if(this.gumballMachine.getRemainGumballCount()>0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
