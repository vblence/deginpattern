package com.degin.pattern.strategy;

public class Md5Strategy implements Strategy {
    @Override
    public void encrygt() {
        System.out.println("MD5");
    }
}
