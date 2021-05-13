package com.lupan.HeadFirstDesignMode.chapter10_state;

/**
 * TODO 拥有状态的机器
 * @author lupan
 * @version 2016/3/28 0028
 */
public class GumballMachine {

    //各个状态的引用
    private NoQuarterState noQuarterState;
    private HasQuarterState hasQuarterState;
    private SoldState soldState;
    private SoldOutState soldOutState;

    //现在状态
    private State state;
    private int remainGumballCount;

    public GumballMachine(int remainGumballCount) {
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.remainGumballCount = remainGumballCount;
        if(this.remainGumballCount>0){
            state = noQuarterState;
        }else{
            state = soldOutState;
        }
    }

    /**
     * 状态机可以操作的方法
     */
    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
    }

    public void dispense(){
        state.dispense();
    }

    /**
     * 释放果球
     */
    public void releaseBall(){
        System.out.println("果球正在释放，请拿取。。。");
        this.remainGumballCount--;
    }

    public NoQuarterState getNoQuarterState() {
        return noQuarterState;
    }

    public HasQuarterState getHasQuarterState() {
        return hasQuarterState;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    public SoldOutState getSoldOutState() {
        return soldOutState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getRemainGumballCount() {
        return remainGumballCount;
    }
}
