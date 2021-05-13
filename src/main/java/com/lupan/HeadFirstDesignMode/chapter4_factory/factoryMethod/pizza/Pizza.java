package com.lupan.HeadFirstDesignMode.chapter4_factory.factoryMethod.pizza;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public abstract class Pizza {

    protected String name;

    public void prepare(){
        System.out.println("订购pizza类型："+this.name);
       System.out.println("1.准备");
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
