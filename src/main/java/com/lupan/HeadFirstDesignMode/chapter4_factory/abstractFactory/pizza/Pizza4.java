package com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.pizza;

import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.factory.SourceFactory;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public class Pizza4 extends Pizza {
    public Pizza4(SourceFactory sourceFactory) {
        this.name = "披萨4";
        this.sourceFactory = sourceFactory;
    }
}
