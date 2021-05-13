package com.lupan.HeadFirstDesignMode.chapter3_decorator;

/**
 * TODO 烘焙咖啡
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public class DarkRoast extends Beverage{

    public DarkRoast(){
        this.description = "烘焙咖啡DarkRoast";
    }

    @Override
    public double cost() {
        return 11.0;
    }
}
