package com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.pizza;

import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.factory.SourceFactory;
import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.source.Cheese;
import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.source.Dough;
import com.lupan.HeadFirstDesignMode.chapter4_factory.abstractFactory.source.Sauce;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public abstract class Pizza {

    protected String name;
    //原料
    protected Cheese cheese;
    protected Dough dough;
    protected Sauce sauce;
    //创建具体原料对象的工厂
    protected SourceFactory sourceFactory;

    public final void prepare(){
        System.out.println("订购pizza类型："+this.name);
        System.out.println("1.准备");
        this.cheese = sourceFactory.createCheese();
        this.dough = sourceFactory.createDough();
        this.sauce = sourceFactory.createSauce();
    }

    public void bake(){
        System.out.println("2.烘焙");
    }

    public void cut(){
        System.out.println("3.分块");
    }

    public void box(){
        System.out.println("4.打包");
    }
}
