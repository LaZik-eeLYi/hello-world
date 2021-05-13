package com.lupan.HeadFirstDesignMode.chapter6_command.command;

import com.lupan.HeadFirstDesignMode.chapter6_command.receiver.Light;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.lightOn();
    }

    @Override
    public void undo() {
        this.light.lightOff();
    }
}
