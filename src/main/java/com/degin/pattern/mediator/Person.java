package com.degin.pattern.mediator;

public abstract class Person {
    private String name;
    protected Mediator mediator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    public abstract void sendMessage(String message,Person person);
}
