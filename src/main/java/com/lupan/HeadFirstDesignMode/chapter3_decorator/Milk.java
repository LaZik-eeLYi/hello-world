package com.lupan.HeadFirstDesignMode.chapter3_decorator;

/**
 * TODO 牛奶调料
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public class Milk extends CondimentDecorator{

    /**
     * 构造方法初始化要装饰的对象
     */
    public Milk( Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ",牛奶调料Milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.5;
    }
}
