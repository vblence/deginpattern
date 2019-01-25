package com.degin.pattern.responsibility;

public class InfoLogger extends  AbstractLogger {
    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Info");
        System.out.println(message);
    }
}
