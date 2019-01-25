package com.degin.pattern.prototype;

/**
 * @Description 原型模式
 **/
public class test {
    public static void main(String[] args){
        Prototype prototype=new Prototype("zhang");

        Prototype clone= prototype.clone();

        System.out.println(prototype.getClass()==clone.getClass());

        System.out.println(prototype==clone);

        System.out.println(clone.getName());
    }
}
