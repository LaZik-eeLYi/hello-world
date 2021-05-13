package com.lupan.HeadFirstDesignMode.chapter9_iteratorAndComposite.composite;

import java.util.Iterator;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/24 0024
 */
public class Main {

    public static void main(String[] args){

        Menu rootMenu = new Menu("根菜单");
        Menu breakfastMenu = new Menu("早餐菜单");
        breakfastMenu.add(new Item("包子","1￥",false));
        breakfastMenu.add(new Item("馒头","1.5￥",true));
        breakfastMenu.add(new Item("油条","1￥",true));
        Menu breakfastBeverageMenu = new Menu("早餐饮料菜单");
        breakfastBeverageMenu.add(new Item("豆浆","1￥",true));
        breakfastBeverageMenu.add(new Item("皮蛋瘦肉粥","1.5￥",false));
        breakfastBeverageMenu.add(new Item("稀饭","1￥",true));
        breakfastMenu.add(breakfastBeverageMenu);
        rootMenu.add(breakfastMenu);

        Menu launch = new Menu("午餐菜单");
        launch.add(new Item("炒生菜","4￥",true));
        launch.add(new Item("宫保鸡丁","9￥",false));
        launch.add(new Item("回锅肉","10￥",false));
        rootMenu.add(launch);

        Menu dinner = new Menu("晚餐菜单");
        dinner.add(new Item("炒土豆","4￥",true));
        dinner.add(new Item("炒白菜","5￥",true));
        dinner.add(new Item("回锅肉","10￥",false));
        rootMenu.add(dinner);

        //打印所有菜单项
        System.out.println("************打印所有菜单项***************");
        rootMenu.print();

        //遍历找出所有素食菜单项
        System.out.println("************遍历找出所有素食菜单项***************");
        Iterator<MenuComponent> iterator = rootMenu.getIterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            if(menuComponent instanceof Item && menuComponent.isVegetarian()){
                menuComponent.print();
            }
        }

        //遍历找出所有价格小于6￥的菜品
        System.out.println("************遍历找出所有价格小于6￥的菜品***************");
        Iterator<MenuComponent> iterator2 = rootMenu.getIterator();
        while (iterator2.hasNext()){
            MenuComponent menuComponent = iterator2.next();
            if(menuComponent instanceof Item ) {
                if (priceStringToDouble(menuComponent.getPrice())<6.0) {
                    menuComponent.print();
                }
            }
        }
    }

    public static double priceStringToDouble(String priceString){
        return Double.parseDouble(priceString.replace("￥",""));
    }
}
