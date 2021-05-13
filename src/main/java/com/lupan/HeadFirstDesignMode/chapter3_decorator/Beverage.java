package com.lupan.HeadFirstDesignMode.chapter3_decorator;

/**
 * TODO 饮料父类
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public abstract class Beverage {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
