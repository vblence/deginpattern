package com.degin.pattern.adapter;

/**
 * @Description 适配器模式
 **/
public class test {
    public static void main(String[] args){
        /**
         * 类适配器
         * */
        Battery220V battery220V=new Adapter();
        battery220V.use220v();

        /**
         * 对象适配器
         * */
        Battery220V battery2=new Adapter2(new UseBattery());
        battery2.use220v();
    }
}
