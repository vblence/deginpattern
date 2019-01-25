package com.degin.pattern.state;

public class ConcreteStateB extends State {
    @Override
    void handle(Context context) {
        if(context.getNum()==2){
            System.out.println("2");
        }else{
            context.setState(new ConcreteStateC());
            context.getState().handle(context);
        }
    }
}
