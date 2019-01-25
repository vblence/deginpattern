package com.degin.pattern.command;

public class ConcreteReciver implements Reciver {
    @Override
    public void sendMessage() {
        System.out.println("Concrete Reciver Send Message");
    }
}
