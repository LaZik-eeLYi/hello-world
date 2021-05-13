package com.lupan.HeadFirstDesignMode.chapter1_strategy.entity;

import com.lupan.HeadFirstDesignMode.chapter1_strategy.behaviorImpl.cannotFlay;
import com.lupan.HeadFirstDesignMode.chapter1_strategy.behaviorImpl.ggQuack;
import com.lupan.HeadFirstDesignMode.chapter1_strategy.entity.Duck;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/17 0017
 */
public class YellowDuck extends Duck {

    public YellowDuck(){
        this.flayBehavior = new cannotFlay();
        this.quackBehavior = new ggQuack();
    }

    @Override
    public void display() {
        System.out.println("我是一只黄鸭子！");
    }


}
