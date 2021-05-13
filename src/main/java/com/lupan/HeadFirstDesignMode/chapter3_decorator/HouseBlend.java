package com.lupan.HeadFirstDesignMode.chapter3_decorator;

/**
 * TODO 混合咖啡
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        this.description = "混合咖啡HouseBlend";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
