package com.degin.pattern.proxy;

public class RealSubject implements Subject {
    @Override
    public void sailBook() {
        System.out.println("Real Subject");
    }
}
