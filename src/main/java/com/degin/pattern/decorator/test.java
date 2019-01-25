package com.degin.pattern.decorator;

/**
 * @Description 装饰者模式
 **/
public class test
{
    public static void main(String[] args) {
        Component component=new ConcreateComponent();
        ConcreateDecorator concreateDecorator=new ConcreateDecorator();
        concreateDecorator.setComponent(component);

        concreateDecorator.Operation();
    }
}
