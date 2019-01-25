package com.degin.pattern.mediator;

/**
 * @Description 中介者模式
 **/
public class test {
    public static void main(String[] args) {
        ConcreateMediator concreateMediator=new ConcreateMediator();
        Person man=new ManPerson("zhang",concreateMediator);
        Person women=new WomanPerson("nv",concreateMediator);

        man.sendMessage("你好",women);
    }
}
