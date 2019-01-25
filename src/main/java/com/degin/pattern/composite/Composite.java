package com.degin.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends  Component {
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    List<Component> componentList=new ArrayList<>();

    public void add(Component component){
        componentList.add(component);
    }

    public void remove(Component component){
        componentList.remove(component);
    }

    public Component getChild(int index){
        return componentList.get(index);
    }

    @Override
    void Operation() {
        System.out.println(this.name);
        for (Component component:componentList){
            component.Operation();
        }
    }
}
