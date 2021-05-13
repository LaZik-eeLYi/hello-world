package com.lupan.HeadFirstDesignMode.chapter2_observer.interfaces;


/**
 * TODO 主题（被观察者）
 *
 * @author lupan
 * @version 2016/3/17 0017
 */
public interface ISubject {

    void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();

}
