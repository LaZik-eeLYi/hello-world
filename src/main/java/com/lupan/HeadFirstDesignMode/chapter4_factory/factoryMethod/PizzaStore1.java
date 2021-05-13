package com.lupan.HeadFirstDesignMode.chapter4_factory.factoryMethod;

import com.lupan.HeadFirstDesignMode.chapter4_factory.common.*;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public class PizzaStore1 extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case PIZZA_TYPE1:
                return new Pizza1();
            case PIZZA_TYPE2:
                return new Pizza2();
            default:
                System.err.println("pizzaStore1没有此类别！");
        }
        return null;
    }
}
