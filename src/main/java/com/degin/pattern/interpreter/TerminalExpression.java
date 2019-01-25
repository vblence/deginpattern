package com.degin.pattern.interpreter;

import org.assertj.core.util.Lists;

import java.util.List;

public class TerminalExpression implements Expression {
    private List<String> num = Lists.list("1", "2", "3", "4", "5", "6", "7", "8", "9", "0");

    private List<String> data;

    public TerminalExpression(List<String> data) {
        this.data = data;
    }

    @Override
    public void interpret(String info) {
        String output = "";
        char[] chars = info.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            String temp = String.valueOf(chars[i]);
            int index = num.indexOf(temp);
            if (index >= 0) {
                output += data.get(index);
            } else {
                output += temp;
            }
        }
        System.out.println(output);
    }
}
