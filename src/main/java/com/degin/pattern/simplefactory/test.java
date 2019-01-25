package com.degin.pattern.simplefactory;

/**
 * @Description 简单工厂模式
 **/
public class test {
    public static void main(String[] args){
        Factory factory=new Factory();
        factory.getFruit(new Apple());
    }
}
