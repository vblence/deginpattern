package com.degin.pattern.mediator;

public class WomanPerson extends Person {
    public WomanPerson(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void sendMessage(String message,Person person) {
        this.mediator.sendMessage(message,this,person);
    }
}
