package com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory;


import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.factory.SourceFactory;
import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.factory.SourceFactory1;
import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.pizza.Pizza;
import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.pizza.Pizza1;
import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.pizza.Pizza2;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public class PizzaStore1 extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        SourceFactory sourceFactory = new SourceFactory1();
        switch (type) {
            case PIZZA_TYPE1:
                return new Pizza1(sourceFactory);
            case PIZZA_TYPE2:
                return new Pizza2(sourceFactory);
            default:
                System.err.println("pizzaStore1没有此类别！");
        }
        return null;
    }
}
