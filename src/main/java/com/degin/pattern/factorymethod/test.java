package com.degin.pattern.factorymethod;

/**
 * @Description 工厂方法模式
 **/
public class test {
    public static void main(String[] args){
        Factory factory=new AddFactory();
        double num=factory.createOpeartion().getResult(1,2);
        System.out.println(num);
    }
}
