package com.degin.pattern.abstractfactory;

/**
 * @Description 抽象工厂模式
 **/
public class test {
    public static void main(String[] args){
        IFamilyFactory familyFactory=new ChineseFamilyFactory();
        IFather father=familyFactory.createFather();
        father.PrintName();
    }
}
