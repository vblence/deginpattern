package com.degin.pattern.command;

/**
 * @Description 调用者
 **/
public class Invoke {
    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.excute();
    }
}
