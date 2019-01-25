package com.degin.pattern.bridge;

public class ImplementorCenter implements Implementor {
    @Override
    public void Operation() {
        System.out.println("中号");
    }
}
