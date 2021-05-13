package com.lupan.HeadFirstDesignMode.chapter1_strategy.behaviorImpl;

import com.lupan.HeadFirstDesignMode.chapter1_strategy.ibehavior.IFlayBehavior;

/**
 * TODO 会飞行为
 *
 * @author lupan
 * @version 2016/3/17 0017
 */
public class canFlay implements IFlayBehavior {

    @Override
    public void flay() {
        System.out.println("我会飞！");
    }
}
