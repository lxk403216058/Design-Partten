package org.example.command;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-17 14:45
 **/
public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onButtonWasPushed(int no) {
        //找到你按下开的按钮，并调用对应方法
        onCommands[no].execute();
        //记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }

    public void offButtonWasPushed(int no) {
        //找到你按下开的按钮，并调用对应方法
        offCommands[no].execute();
        //记录这次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
