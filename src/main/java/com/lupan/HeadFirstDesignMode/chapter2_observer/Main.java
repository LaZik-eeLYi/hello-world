package com.lupan.HeadFirstDesignMode.chapter2_observer;

import com.lupan.HeadFirstDesignMode.chapter2_observer.interfaces.IObserver;
import com.lupan.HeadFirstDesignMode.chapter2_observer.observers.Observer1;
import com.lupan.HeadFirstDesignMode.chapter2_observer.observers.Observer2;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/18 0018
 */
public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        weatherData.setTemperature(20);

        IObserver observer1 = new Observer1();
        IObserver observer2 = new Observer2();

        //添加观察者
        weatherData.addObserver(observer1);
        weatherData.addObserver(observer2);

        //通知观察者
        weatherData.notifyObservers();

        weatherData.setTemperature(-1.5);
        weatherData.notifyObservers();

        weatherData.setTemperature(40);
        weatherData.notifyObservers();

        weatherData.setTemperature(40);
        weatherData.removeObserver(observer1);
        weatherData.notifyObservers();
    }
}
