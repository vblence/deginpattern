package com.degin.pattern.abstractfactory;

public interface IFamilyFactory {
    IMather createMather();

    IFather createFather();
}
