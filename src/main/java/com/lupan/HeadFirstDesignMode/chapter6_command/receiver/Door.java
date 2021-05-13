package com.lupan.HeadFirstDesignMode.chapter6_command.receiver;

/**
 * TODO 命令接收者对象(门控制器)
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public class Door {

    public void doorOpen(){
        System.out.println("开门！");
    }

    public void doorClose(){
        System.out.println("关门！");
    }

}
