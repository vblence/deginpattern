package com.degin.pattern.bridge;

/**
 * @Description 桥接模式
 **/
public class test {
    public static void main(String[] args){
        Implementor implementor=new ImplementorBig();

        AbstractionPen abstractionPen=new RedAbstractionPen(implementor);

        abstractionPen.Operation();
    }
}
