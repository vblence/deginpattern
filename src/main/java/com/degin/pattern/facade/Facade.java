package com.degin.pattern.facade;

public class Facade {
    private SystemA systemA;
    private SystemB systemB;

    public Facade() {
        systemA=new SystemA();
        systemB=new SystemB();
    }

    public void printMessage(){
     this.systemA.printMessage();
     this.systemB.ptrintMessage();
    }
}
