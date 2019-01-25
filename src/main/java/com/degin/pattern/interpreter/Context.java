package com.degin.pattern.interpreter;

import org.assertj.core.util.Lists;

import java.util.List;

public class Context {

    List<String> num1List= Lists.list("壹","贰","叁","肆","伍","陆","柒","捌","玖","零");
    List<String> num2List = Lists.list("一","二","三","四","五","六","七","八","九","零");

    private Expression expression;

    public Context() {
        Expression num1=new TerminalExpression(num1List);
        Expression num2=new TerminalExpression(num2List);

        this.expression = new NonterminalExpression(num1,num2);
    }

    public void  calculate(String info){
        expression.interpret(info);
    }
}
