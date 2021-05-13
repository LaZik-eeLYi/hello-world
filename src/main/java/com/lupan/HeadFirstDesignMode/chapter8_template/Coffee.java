package com.lupan.HeadFirstDesignMode.chapter8_template;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/24 0024
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("放咖啡冲泡。。。");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加糖。。。");
    }
}
