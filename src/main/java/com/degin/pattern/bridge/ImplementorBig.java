package com.degin.pattern.bridge;

public class ImplementorBig implements   Implementor {
    @Override
    public void Operation() {
        System.out.println("大号");
    }
}
