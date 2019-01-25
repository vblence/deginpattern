package com.degin.pattern.interpreter;

public class NonterminalExpression implements Expression {
    private Expression num1;
    private Expression num2;

    public NonterminalExpression(Expression num1, Expression num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void interpret(String info) {
        num1.interpret(info);
        num2.interpret(info);
    }
}
