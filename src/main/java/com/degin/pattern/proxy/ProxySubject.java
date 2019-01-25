package com.degin.pattern.proxy;

public class ProxySubject implements Subject{
    private RealSubject realSubject;

    @Override
    public void sailBook() {
        if(realSubject==null){
            realSubject=new RealSubject();
        }
        this.getBookMessage();
        realSubject.sailBook();
    }

    private void getBookMessage(){
        System.out.println("Message");
    }
}
