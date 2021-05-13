package com.lupan.HeadFirstDesignMode.chapter6_command.command;

import com.lupan.HeadFirstDesignMode.chapter6_command.receiver.Light;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.lightOff();
    }

    @Override
    public void undo() {
        this.light.lightOn();
    }
}
