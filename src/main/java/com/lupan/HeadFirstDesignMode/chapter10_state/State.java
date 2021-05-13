package com.lupan.HeadFirstDesignMode.chapter10_state;

/**
 * TODO 状态父类接口
 *
 * @author lupan
 * @version 2016/3/28 0028
 */
public abstract class State {

    // 每个状态应包含状态机的引用，用于修改其当前状态
    protected  GumballMachine gumballMachine;

    public void insertQuarter(){
        throw new  UnsupportedOperationException("现在不能进行此操作！");
    }

    public void ejectQuarter(){
        throw new  UnsupportedOperationException("现在不能进行此操作！");
    }

    public void turnCrank(){
        throw new  UnsupportedOperationException("现在不能进行此操作！");
    }

    public void dispense(){
        throw new  UnsupportedOperationException("现在不能进行此操作！");
    }
}
