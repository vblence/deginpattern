package com.degin.pattern.adapter;

public class Adapter extends UseBattery implements Battery220V {
    @Override
    public void use220v() {
        use20V();
    }
}
