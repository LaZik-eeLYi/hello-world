package com.lupan.HeadFirstDesignMode.chapter6_command.command;

import com.lupan.HeadFirstDesignMode.chapter6_command.receiver.Door;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public class DoorOpenCommand implements Command {

    private Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.doorOpen();
    }

    @Override
    public void undo() {
        door.doorClose();
    }
}
