package com.lupan.HeadFirstDesignMode.chapter2_observer.observers;

import com.lupan.HeadFirstDesignMode.chapter2_observer.interfaces.IDisplay;
import com.lupan.HeadFirstDesignMode.chapter2_observer.interfaces.IObserver;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/18 0018
 */
public class Observer2 implements IObserver,IDisplay {

    private double temperature;

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        this.display();
    }

    @Override
    public void display() {
        if(temperature<10){
          System.out.println("观察者2：\n太冷了，记得加衣服哦。。。");
        }else if(10<=temperature && temperature<30){
            System.out.println("观察者2：\n温度适宜。。。");
        }else{
            System.out.println("观察者2：\n热成狗了。。。");
        }
    }
}
