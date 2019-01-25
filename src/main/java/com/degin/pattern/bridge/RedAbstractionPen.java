package com.degin.pattern.bridge;

public class RedAbstractionPen extends AbstractionPen {

    public RedAbstractionPen(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void Operation() {
        System.out.print("Red Pen:");
        this.getImplementor().Operation();
    }
}
