package com.lupan.HeadFirstDesignMode.chapter8_template;

import java.util.Scanner;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/24 0024
 */
public class Tea extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("放茶叶浸泡。。。");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加柠檬。。。");
    }

    @Override
    public boolean wantsCondiments(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("是否添加调料？");
        String inputString = scanner.next();
        scanner.close();
        if(inputString.equals("y")){
           return true;
        }else{
            return false;
        }
    }
}
