package com.degin.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observerList;
    private String message;

    public ConcreteSubject(){
        observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(!observerList.isEmpty()) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < observerList.size(); i++) {
            Observer oserver = observerList.get(i);
            oserver.update(message);
        }
    }

    /**
     * subject变更,通知订阅者
     * **/
    public void subjectChange(String message){
        System.out.println("主题变更："+message);
        this.message=message;
        notifyObserver();
    }
}
