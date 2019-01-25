package com.degin.pattern.responsibility;

public class DebugLogger extends AbstractLogger {
    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Debug");
        System.out.println(message);
    }
}
