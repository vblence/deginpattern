package com.degin.pattern.factorymethod;

public class Sum implements Operation {
    @Override
    public double getResult(double num1, double num2) {
        return num1-num2;
    }
}
