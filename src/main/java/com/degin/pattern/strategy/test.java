package com.degin.pattern.strategy;

/**
 * @Description 策略模式
 **/
public class test {
    public static void main(String[] args){
        Context context=new Context(new Md5Strategy());
        context.getStrategy();
    }
}
