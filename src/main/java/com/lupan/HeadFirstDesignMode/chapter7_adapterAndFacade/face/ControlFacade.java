package com.lupan.HeadFirstDesignMode.chapter7_adapterAndFacade.face;

/**
 * TODO 控制的门面
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public class ControlFacade {

    private Door door;
    private Light light;
    private Television television;

    public ControlFacade(Door door, Light light, Television television) {
        this.door = door;
        this.light = light;
        this.television = television;
    }

    /**
     * 进屋（封装各种操作的方法）
     */
    public void goInHome(){
        door.doorOpen();
        light.lightOn();
        television.turnOn();
    }

    /**
     * 出门
     */
    public void goOutHome(){
        television.turnOff();
        light.lightOff();
        door.doorClose();
    }
}
