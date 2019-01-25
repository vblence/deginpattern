package com.degin.pattern.flyweight;

/**
 * @Description 享元模式
 **/
public class test
{
    public static void main(String[] args){
        String[] strs={"A","B","C","A"};
        for (String temp:strs){
            FlyweightFactory.getFlyweight(temp);
        }
    }
}
