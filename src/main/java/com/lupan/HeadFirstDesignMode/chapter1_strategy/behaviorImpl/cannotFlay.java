package com.lupan.HeadFirstDesignMode.chapter1_strategy.behaviorImpl;

import com.lupan.HeadFirstDesignMode.chapter1_strategy.ibehavior.IFlayBehavior;

/**
 * TODO 不会飞行为
 *
 * @author lupan
 * @version 2016/3/17 0017
 */
public class cannotFlay implements IFlayBehavior {

    @Override
    public void flay() {
        System.out.println("我不会飞！");
    }
}
