package com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public class Main {

    public static void main(String[] args){

        PizzaStore pizzaStore1 = new PizzaStore1();
        pizzaStore1.order(PizzaType.PIZZA_TYPE1);

        PizzaStore pizzaStore2 = new PizzaStore2();
        pizzaStore2.order(PizzaType.PIZZA_TYPE3);
    }
}
