package com.degin.pattern.dynamicproxy;

public class RealSubject implements Subject {
    @Override
    public void sailBook() {
        System.out.println("Real Subject");
    }
}
