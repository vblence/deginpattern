package com.degin.pattern.composite;

/**
 * @Description 组合模式
 **/
public class test {
    public static void main(String[] args) {
        Composite composite=new Composite("File");
        Composite compositeChild= new Composite("File Child");

        compositeChild.add(new Leaf("Txt"));
        compositeChild.add(new Leaf("Img"));

        composite.add(compositeChild);
        composite.add(new Leaf("cnf"));

        composite.Operation();
    }
}
