package org.example.command;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-17 15:02
 **/
public class TvOffCommand implements Command {
    TvReceiver tv;

    public TvOffCommand(TvReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
