package com.degin.pattern.strategy;

public class Context {
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    private Strategy strategy;
    public void getStrategy(){
        this.strategy.encrygt();
    }
}
