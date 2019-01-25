package com.degin.pattern.adapter;

public class Adapter2 implements Battery220V {
    private UseBattery useBattery;

    public Adapter2(UseBattery useBattery) {
        this.useBattery = useBattery;
    }

    @Override
    public void use220v() {
        useBattery.use20V();
    }
}
