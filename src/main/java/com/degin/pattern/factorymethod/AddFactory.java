package com.degin.pattern.factorymethod;

public class AddFactory implements Factory {
    @Override
    public Operation createOpeartion() {
        return new Add();
    }
}
