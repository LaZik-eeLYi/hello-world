package com.lupan.HeadFirstDesignMode.chapter7_adapterAndFacade.face;

/**
 * TODO 命令接收者对象(灯控制器)
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public class Light {

    public void lightOn(){
        System.out.println("开灯！");
    }

    public void lightOff(){
        System.out.println("关灯！");
    }
}
