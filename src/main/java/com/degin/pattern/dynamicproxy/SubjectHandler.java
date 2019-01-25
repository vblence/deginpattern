package com.degin.pattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectHandler implements InvocationHandler {
    private static RealSubject realSubject;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        this.setMessage();
        if(realSubject==null){
            realSubject=new RealSubject();
        }
        result=method.invoke(realSubject,args);
        return result;
    }

    private void setMessage(){
        System.out.println("set Message");
    }
}
