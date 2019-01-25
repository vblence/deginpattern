package com.degin.pattern.responsibility;

/**
 * @Description 职责链模式
 **/
public class test {
    public static void main(String[] args) {
        AbstractLogger loggerChain = ChainLogger.getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an information.");
    }
}
