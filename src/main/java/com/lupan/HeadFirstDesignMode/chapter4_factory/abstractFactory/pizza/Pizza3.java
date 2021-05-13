package com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.pizza;

import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.factory.SourceFactory;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public class Pizza3 extends Pizza {
    public Pizza3(SourceFactory sourceFactory) {
        this.name = "披萨3";
        this.sourceFactory = sourceFactory;
    }

    @Override
    public void cut(){
        System.out.println("3.分块,分成多个扇形");
    }
}
