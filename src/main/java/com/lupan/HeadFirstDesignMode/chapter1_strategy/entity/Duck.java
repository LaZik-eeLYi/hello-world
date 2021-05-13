package com.lupan.HeadFirstDesignMode.chapter1_strategy.entity;

import com.lupan.HeadFirstDesignMode.chapter1_strategy.ibehavior.IFlayBehavior;
import com.lupan.HeadFirstDesignMode.chapter1_strategy.ibehavior.IQuackBehavior;

/**
 * TODO 鴨子父類
 *
 * @author lupan
 * @version 2016/3/17 0017
 */
public abstract class Duck {

    //组合优于继承
    protected IFlayBehavior flayBehavior;
    protected IQuackBehavior quackBehavior;

    /**
     * 所有鸭子都能游泳
     */
    public void swim(){
        System.out.println("会游泳！");
    }

    /**
     * 所有鸭子有不同外观
     */
    public abstract void display();

    /**
     * 飞行行为调用
     */
    public void flay(){
        flayBehavior.flay();
    }

    /**
     * 叫
     */
    public void quack(){
        quackBehavior.quack();
    }

    public void setFlayBehavior(IFlayBehavior flayBehavior) {
        this.flayBehavior = flayBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
