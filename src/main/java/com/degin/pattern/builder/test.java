package com.degin.pattern.builder;

/**
 * @Description 建造者模式,又称生成器模式
 **/
public class test {
    public static void main(String[] args){
        Director director=new Director();
        CarBuilder carBuilder=new CarBuilder();

        director.constructProduct(carBuilder);

        Car car=carBuilder.builderCar();

        System.out.println(car.getHead()+"..."+car.getCenter()+"..."+car.getTail());
    }
}
