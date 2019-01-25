package com.degin.pattern.command;

/**
 * @Description 具体执行的命令
 **/
public class ConcreteCommand implements Command {
    private Reciver reciver;

    public ConcreteCommand(Reciver reciver) {
        this.reciver = reciver;
    }

    @Override
    public void excute() {
        this.reciver.sendMessage();
    }
}
