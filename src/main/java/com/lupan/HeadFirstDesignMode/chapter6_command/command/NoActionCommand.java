package com.lupan.HeadFirstDesignMode.chapter6_command.command;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public class NoActionCommand implements Command {
    @Override
    public void execute() {
        System.out.println("什么都不做！");
    }

    @Override
    public void undo() {
        System.out.println("什么都不做！");
    }
}
