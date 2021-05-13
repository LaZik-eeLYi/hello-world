package com.lupan.HeadFirstDesignMode.chapter8_template;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/24 0024
 */
public class Main {
    public static void main(String[] args){
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();


        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
