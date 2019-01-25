package com.degin.pattern.decorator;

public abstract class Decorator implements Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if(this.component!=null){
            this.component.Operation();
        }
    }
}
