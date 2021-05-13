package com.lupan.HeadFirstDesignMode.chapter1_strategy.behaviorImpl;

import com.lupan.HeadFirstDesignMode.chapter1_strategy.ibehavior.IQuackBehavior;

/**
 * TODO 吱吱叫行为
 *
 * @author lupan
 * @version 2016/3/17 0017
 */
public class zzQuack implements IQuackBehavior {

    @Override
    public void quack() {
       System.out.println("吱吱叫！");
    }
}
