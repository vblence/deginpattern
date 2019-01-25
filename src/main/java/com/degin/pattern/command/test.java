package com.degin.pattern.command;

/**
 * @Description 命令模式
 **/
public class test {
    public static void main(String[] args){
        Command command=new ConcreteCommand(new ConcreteReciver());

        Invoke invoke=new Invoke(command);

        invoke.action();
    }
}
