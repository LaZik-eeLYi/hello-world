package com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public enum PizzaType {

    PIZZA_TYPE1("披萨1"), PIZZA_TYPE2("披萨2"), PIZZA_TYPE3("披萨3"), PIZZA_TYPE4("披萨4");

    private final String value;

    PizzaType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
