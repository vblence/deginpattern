package com.degin.pattern.template;

public class CalculateSalary extends Calculate {
    @Override
    public void getdata() {
        System.out.println("获取Salary数据");
    }

    @Override
    public void CalculateData() {
        System.out.println("计算Salary数据");
    }

    @Override
    public void returndata() {
        System.out.println("返回Salart数据");
    }
}
