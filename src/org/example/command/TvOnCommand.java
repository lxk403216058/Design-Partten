package org.example.command;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-17 15:05
 **/
public class TvOnCommand implements Command {
    TvReceiver tv;

    public TvOnCommand(TvReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
