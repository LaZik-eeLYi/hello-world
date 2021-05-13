package com.lupan.HeadFirstDesignMode.chapter3_decorator;
import static java.lang.System.out;
/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/21 0021
 */
public class Main {

    public static void main(String[] args){
        //单个饮料
        out.println("单个饮料:");
        Beverage beverage1 = new HouseBlend();
        out.println(beverage1.getDescription()+"----"+beverage1.cost());

        //加一种调料
        out.println("加一种调料:");
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Milk(beverage2);
        out.println(beverage2.getDescription()+"----"+beverage2.cost());

        //加两种调料
        out.println("加一种调料:");
        Beverage beverage3 = new DarkRoast();
        beverage3 = new Milk(beverage3);
        beverage3 = new Whip(beverage3);
        out.println(beverage3.getDescription()+"----"+beverage3.cost());
    }


}
