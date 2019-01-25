package com.degin.pattern.composite;

public class Leaf extends  Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    void Operation() {
        System.out.println(this.name+"叶子节点操作");
    }
}
