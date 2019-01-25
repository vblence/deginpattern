package com.degin.pattern.observer;

/**
 * @Description 观察者模式
 **/
public class test {
    public static void main(String[] args){
        ConcreateObserver a=new ConcreateObserver("a");
        ConcreateObserver b=new ConcreateObserver("b");


        ConcreteSubject concreteSubject=new ConcreteSubject();
        concreteSubject.registerObserver(a);
        concreteSubject.registerObserver(b);

        concreteSubject.subjectChange("你好!!!!!");
    }
}
