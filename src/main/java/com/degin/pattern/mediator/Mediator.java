package com.degin.pattern.mediator;

public abstract class Mediator {
    abstract void sendMessage(String message,Person thisPerson,Person targetPerson);
}
