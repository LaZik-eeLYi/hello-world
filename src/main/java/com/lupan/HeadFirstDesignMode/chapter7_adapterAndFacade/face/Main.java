package com.lupan.HeadFirstDesignMode.chapter7_adapterAndFacade.face;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public class Main {
    public static void main(String[] args){
        //正常调用
        Door door = new Door();
        Light light = new Light();
        Television television = new Television();

        door.doorOpen();
        light.lightOn();
        television.turnOn();

        //简化门面调用
        ControlFacade controlFacade = new ControlFacade(door,light,television);
        controlFacade.goInHome();
        controlFacade.goOutHome();

    }
}
