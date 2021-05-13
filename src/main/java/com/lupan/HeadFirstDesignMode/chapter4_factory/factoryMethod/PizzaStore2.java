package com.lupan.HeadFirstDesignMode.chapter4_factory.factoryMethod;

import com.lupan.HeadFirstDesignMode.chapter4_factory.common.*;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public class PizzaStore2 extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case PIZZA_TYPE3:
                return new Pizza3();
            case PIZZA_TYPE4:
                return new Pizza4();
            default:
                System.err.println("pizzaStore2没有此类别！");
        }
        return null;
    }
}
