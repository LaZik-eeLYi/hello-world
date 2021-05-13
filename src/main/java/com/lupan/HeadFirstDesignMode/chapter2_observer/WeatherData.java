package com.lupan.HeadFirstDesignMode.chapter2_observer;

import com.lupan.HeadFirstDesignMode.chapter2_observer.interfaces.IObserver;
import com.lupan.HeadFirstDesignMode.chapter2_observer.interfaces.ISubject;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/17 0017
 */
public class WeatherData implements ISubject {

    private double temperature;
    List<IObserver> observerList = new ArrayList<IObserver>();

    @Override
    public void addObserver(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observerList){
            observer.update(temperature);
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

}
