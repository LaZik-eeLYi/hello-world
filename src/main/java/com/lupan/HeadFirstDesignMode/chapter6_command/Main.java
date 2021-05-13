package com.lupan.HeadFirstDesignMode.chapter6_command;

import com.lupan.HeadFirstDesignMode.chapter6_command.command.DoorCloseCommand;
import com.lupan.HeadFirstDesignMode.chapter6_command.command.DoorOpenCommand;
import com.lupan.HeadFirstDesignMode.chapter6_command.command.LightOffCommand;
import com.lupan.HeadFirstDesignMode.chapter6_command.command.LightOnCommand;
import com.lupan.HeadFirstDesignMode.chapter6_command.invoker.Controller;
import com.lupan.HeadFirstDesignMode.chapter6_command.receiver.Door;
import com.lupan.HeadFirstDesignMode.chapter6_command.receiver.Light;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public class Main {
    public static void  main(String[] args){

        //初始化设置
        Controller controller = new Controller();

        Door door = new Door();
        DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door);
        DoorCloseCommand doorCloseCommand = new DoorCloseCommand(door);
        controller.setCommendToSlot(0,doorOpenCommand);
        controller.setCommendToSlot(1,doorCloseCommand);

        Light light = new Light();
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        controller.setCommendToSlot(2,lightOnCommand);
        controller.setCommendToSlot(3,lightOffCommand);

        System.out.println(controller);

        //测试
        controller.pressButton(0);
        controller.pressButton(1);
        controller.pressUndo();

        controller.pressButton(2);
        controller.pressButton(3);
        controller.pressUndo();


    }
}
