package com.lupan.HeadFirstDesignMode.chapter4_factory.factoryMethod.pizza;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public class Pizza3 extends Pizza {
    public Pizza3() {
        this.name = "披萨3";
    }

    @Override
    public void cut(){
        System.out.println("3.分块,分成多个扇形");
    }
}
