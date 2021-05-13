package com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.factory;

import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.source.*;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/22 0022
 */
public class SourceFactory2 implements SourceFactory {
    @Override
    public Cheese createCheese() {
        return new Cheese2();
    }

    @Override
    public Dough createDough() {
        return new Dough2();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce2();
    }
}
