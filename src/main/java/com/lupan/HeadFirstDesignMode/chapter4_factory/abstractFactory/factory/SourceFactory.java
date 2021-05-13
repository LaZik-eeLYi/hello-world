package com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.factory;

import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.source.Cheese;
import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.source.Dough;
import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.source.Sauce;

/**
 * TODO 生成原料的抽象工厂
 *
 * @author lupan
 * @version 2016/3/22 0022
 */
public interface SourceFactory {
     Cheese createCheese();
     Dough createDough();
     Sauce createSauce();
}
