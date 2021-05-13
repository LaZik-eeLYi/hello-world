package com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory;

import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.factory.SourceFactory;
import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.factory.SourceFactory2;
import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.pizza.*;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public class PizzaStore2 extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        SourceFactory sourceFactory = new SourceFactory2();
        switch (type) {
            case PIZZA_TYPE3:
                return new Pizza3(sourceFactory);
            case PIZZA_TYPE4:
                return new Pizza4(sourceFactory);
            default:
                System.err.println("pizzaStore2没有此类别！");
        }
        return null;
    }
}
