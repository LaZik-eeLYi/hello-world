package com.lupan.HeadFirstDesignMode.chapter1_strategy;

import com.lupan.HeadFirstDesignMode.chapter1_strategy.behaviorImpl.canFlay;
import com.lupan.HeadFirstDesignMode.chapter1_strategy.behaviorImpl.zzQuack;
import com.lupan.HeadFirstDesignMode.chapter1_strategy.entity.Duck;
import com.lupan.HeadFirstDesignMode.chapter1_strategy.entity.WhiteDuck;
import com.lupan.HeadFirstDesignMode.chapter1_strategy.entity.YellowDuck;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/17 0017
 */
public class Main {
    public static void main(String[] args){
        Duck yellowDuck = new YellowDuck();
        Duck whiteDuck = new WhiteDuck();

        yellowDuck.flay();
        yellowDuck.quack();
        yellowDuck.setFlayBehavior(new canFlay());
        yellowDuck.setQuackBehavior(new zzQuack());
        System.out.println("--动态改变行为--");
        yellowDuck.flay();
        yellowDuck.quack();

        whiteDuck.flay();
        whiteDuck.quack();
    }
}
