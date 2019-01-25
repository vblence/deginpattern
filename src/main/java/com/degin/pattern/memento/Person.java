package com.degin.pattern.memento;


public class Person {
    private String name;
    private String sex;

    public Memoto createMemoto() {
        return new Memoto(name, sex);
    }

    public void setMemoto(Memoto memoto) {
        this.name = memoto.getName();
        this.sex = memoto.getSex();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
}
