package com.degin.pattern.factorymethod;

public class SumFactory implements Factory {
    @Override
    public Operation createOpeartion() {
        return new Sum();
    }
}
