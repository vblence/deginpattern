package com.degin.pattern.state;

public class ConcreteStateA extends State {
    @Override
    void handle(Context context) {
        if(context.getNum()==1) {
            System.out.println("1");
        }else{
            context.setState(new ConcreteStateB());
            context.getState().handle(context);
        }
    }
}
