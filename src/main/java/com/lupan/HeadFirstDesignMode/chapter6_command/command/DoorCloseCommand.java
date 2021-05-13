package com.lupan.HeadFirstDesignMode.chapter6_command.command;

import com.lupan.HeadFirstDesignMode.chapter6_command.receiver.Door;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public class DoorCloseCommand implements Command {

    private Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.doorClose();
    }

    @Override
    public void undo() {
        door.doorOpen();
    }
}
