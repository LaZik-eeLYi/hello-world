package com.lupan.HeadFirstDesignMode.chapter2_observer.observers;

import com.lupan.HeadFirstDesignMode.chapter2_observer.interfaces.IDisplay;
import com.lupan.HeadFirstDesignMode.chapter2_observer.interfaces.IObserver;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/18 0018
 */
public class Observer1  implements IObserver,IDisplay {

    private double temperature;

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        this.display();
    }

    @Override
    public void display() {
        System.out.println(String.format("观察者1：\n温度为%s摄氏度",temperature));
    }
}
