package com.degin.pattern.singleton;

public class Person {
    //饿汉式
    private static final Person PERSON = new Person();
    //懒汉式
    private static Person person;

    public static Person getInstance() {
        return PERSON;
    }

    public static Person getInstance2() {
        if (person == null) {
            person = new Person();
        }
        return person;
    }

    //多线程处理
    //双重检查
    private static Object object=new Object();
    public static Person getInstance3() {
        if (person == null) {
            synchronized (object) {
                if(person==null) {
                    person = new Person();
                }
            }
        }
        return person;
    }

    //静态内部类
    private static class PersonInstance{
        private static final Person Instance = new Person();
    }

    public static  Person getInstance4(){
        return PersonInstance.Instance;
    }

    private Person() {

    }
}
