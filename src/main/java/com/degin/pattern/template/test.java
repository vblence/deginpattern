package com.degin.pattern.template;

/**
 * @Description 模板模式
 **/
public class test {
    public static void main(String[] args){
        CalculatePrice calculatePrice=new CalculatePrice();
        calculatePrice.excute();

        CalculateSalary calculateSalary=new CalculateSalary();
        calculateSalary.excute();
    }
}
