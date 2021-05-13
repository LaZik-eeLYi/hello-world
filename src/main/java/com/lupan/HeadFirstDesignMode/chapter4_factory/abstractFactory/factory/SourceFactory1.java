package com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.factory;

import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.source.*;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/22 0022
 */
public class SourceFactory1 implements SourceFactory {
    @Override
    public Cheese createCheese() {
        return new Cheese1();
    }

    @Override
    public Dough createDough() {
        return new Dough1();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce1();
    }
}
