package com.degin.pattern.decorator;

public class ConcreateDecorator extends Decorator {
    @Override
    public void Operation() {
        super.Operation();
        addMessage();
        System.out.println("2.zai");
    }

    private void addMessage(){
        System.out.println("duanxian");
    }
}
