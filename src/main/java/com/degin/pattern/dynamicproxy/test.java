package com.degin.pattern.dynamicproxy;


import java.lang.reflect.Proxy;

/**
 * @Description 动态代理模式
 **/
public class test {
    public static void main(String[] args) {
        SubjectHandler subjectHandler = new SubjectHandler();
        Subject subject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), subjectHandler);
        subject.sailBook();
    }
}
