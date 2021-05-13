package com.lupan.HeadFirstDesignMode.chapter4_factory.common;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public abstract class PizzaStore {

    /**
     * 创建不同种类的pizza的工厂方法
     * @param type 类型
     * @return 披萨
     */
    public abstract Pizza createPizza(PizzaType type);

    /**
     * 订购，固定子类不能修改
     * @param type 类型
     * @return 披萨
     */
    public final Pizza order(PizzaType type){
        Pizza pizza = this.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
