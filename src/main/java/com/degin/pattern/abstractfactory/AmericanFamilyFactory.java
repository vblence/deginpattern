package com.degin.pattern.abstractfactory;

public class AmericanFamilyFactory implements  IFamilyFactory {
    @Override
    public IMather createMather() {
        return new AmericanMather();
    }

    @Override
    public IFather createFather() {
        return new AmericanFather();
    }
}
