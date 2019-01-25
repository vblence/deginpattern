package com.degin.pattern.observer;

public interface Subject {
    /**
     * 订阅
     * **/
    void registerObserver(Observer observer);
    /**
     * 移除订阅
     * **/
    void removeObserver(Observer observer);

    /**
     * 发布
     * **/
    void notifyObserver();
}
