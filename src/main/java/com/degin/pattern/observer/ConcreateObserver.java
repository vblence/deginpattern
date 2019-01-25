package com.degin.pattern.observer;

public class ConcreateObserver implements Observer {
    private String name;
    private String message;

    public ConcreateObserver(String name){
        this.name=name;
    }

    @Override
    public void update(String message) {
        this.message=message;
        System.out.println(name+"接收消息："+message);
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
