package com.degin.pattern.adapter;

public class UseBattery implements Battery20V {
    @Override
    public void use20V() {
        System.out.println("20V");
    }
}
