package com.degin.pattern.abstractfactory;

public class ChineseFamilyFactory implements IFamilyFactory {
    @Override
    public IMather createMather() {
        return new ChineseMather();
    }

    @Override
    public IFather createFather() {
        return new ChineseFather();
    }
}
