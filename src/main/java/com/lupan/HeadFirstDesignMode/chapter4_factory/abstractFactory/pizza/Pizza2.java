package com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.pizza;

import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.factory.SourceFactory;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public class Pizza2 extends Pizza {
    public Pizza2(SourceFactory sourceFactory) {
        this.name = "披萨2";
        this.sourceFactory = sourceFactory;
    }
}
