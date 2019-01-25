package com.degin.pattern.bridge;

public abstract class AbstractionPen {
    private Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public AbstractionPen(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void Operation();
}
