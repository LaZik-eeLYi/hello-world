package com.lupan.HeadFirstDesignMode.chapter6_command.invoker;

import com.lupan.HeadFirstDesignMode.chapter6_command.command.Command;
import com.lupan.HeadFirstDesignMode.chapter6_command.command.NoActionCommand;

/**
 * TODO 命令调用者对象
 *
 * @author lupan
 * @version 2016/3/23 0023
 */
public class Controller {

    Command[] commands ;
    Command lastCommand ;

    /**
     * 初始化分配无动作的命令对象避免空指针判断
     */
    public Controller() {
        this.commands = new Command[4];
        NoActionCommand noActionCommand = new NoActionCommand();
        for (int i = 0; i <4; i++) {
            commands[i] = noActionCommand;
        }
    }

    /**
     * 设置每个按钮的命令对象
     * @param slot 按钮号
     * @param command 命令对象
     */
    public void setCommendToSlot(int slot,Command command){
         commands[slot] = command;
    }

    public void pressButton(int slot){
        commands[slot].execute();
        lastCommand =  commands[slot];
    }

    public void pressUndo(){
        lastCommand.undo();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n----controller----\n");
        int count = 0;
        for(Command command:commands){
            count++;
            sb.append(String.format("命令对象%s----名：%s\n",count,command.getClass().getName()));
        }
        return sb.toString();
    }
}
