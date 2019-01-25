package com.degin.pattern.mediator;

public class ManPerson extends Person {
    public ManPerson(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void sendMessage(String message,Person person) {
        this.mediator.sendMessage(message,this,person);
    }
}
