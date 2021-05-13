package com.lupan.HeadFirstDesignMode.chapter6_command.command;

/**
 * TODO 命令对象
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();

}
