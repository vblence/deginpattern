package com.degin.pattern.mediator;

public class ConcreateMediator extends Mediator {

    public ConcreateMediator() {
    }

    @Override
    void sendMessage(String message,Person thisPerson,Person targetPerson) {
        System.out.println(thisPerson.getName()+" 通知 "+targetPerson.getName()+"  "+message);
    }
}
