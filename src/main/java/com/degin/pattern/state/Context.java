package com.degin.pattern.state;

public class Context {
    private State state;
    private int num;

    public void request(){
        if(state==null){
            //默认初始化状态
            this.state=new ConcreteStateA();
        }
        state.handle(this);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
