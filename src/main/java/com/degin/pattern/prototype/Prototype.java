package com.degin.pattern.prototype;

public class Prototype implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Prototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
