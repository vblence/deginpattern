package com.degin.pattern.singleton;

/**
 * @Description 单例模式
 **/
public class test {
    public static void main(String[] args){
        Person p=Person.getInstance();
        Person p2=Person.getInstance();
        System.out.println(p==p2);

        Person p3=Person.getInstance2();
        Person p4=Person.getInstance2();
        System.out.println(p3==p4);

        Person p5=Person.getInstance3();
        Person p6=Person.getInstance3();
        System.out.println(p5==p6);
    }
}
