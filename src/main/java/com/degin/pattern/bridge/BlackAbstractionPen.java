package com.degin.pattern.bridge;

public class BlackAbstractionPen extends AbstractionPen{
    public BlackAbstractionPen(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void Operation() {
        System.out.println("Black:");
        this.getImplementor().Operation();
    }
}
