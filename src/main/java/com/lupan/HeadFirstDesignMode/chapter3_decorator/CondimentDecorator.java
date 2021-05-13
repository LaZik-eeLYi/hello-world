package com.lupan.HeadFirstDesignMode.chapter3_decorator;

/**
 * TODO 调料装饰器父类
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public abstract class CondimentDecorator extends Beverage{

    //被装饰对象
    protected Beverage beverage;

    //描述方法重载
    public abstract String getDescription();
}
