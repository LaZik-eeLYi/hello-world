package com.lupan.HeadFirstDesignMode.chapter1_strategy.entity;

import com.lupan.HeadFirstDesignMode.chapter1_strategy.behaviorImpl.canFlay;
import com.lupan.HeadFirstDesignMode.chapter1_strategy.behaviorImpl.zzQuack;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/17 0017
 */
public class WhiteDuck extends Duck {

    public WhiteDuck(){
        this.flayBehavior = new canFlay();
        this.quackBehavior = new zzQuack();
    }

    @Override
    public void display() {
        System.out.println("我是一只白鸭子！");
    }
}
