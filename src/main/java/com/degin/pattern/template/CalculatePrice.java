package com.degin.pattern.template;

public class CalculatePrice extends Calculate {
    @Override
    public void getdata() {
        System.out.println("获取Price数据");
    }

    @Override
    public void CalculateData() {
        System.out.println("计算Price数据");
    }

    @Override
    public void returndata() {
        System.out.println("返回Price数据");
    }
}
