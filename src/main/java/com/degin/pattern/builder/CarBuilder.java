package com.degin.pattern.builder;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    @Override
    public void builderHead() {
        car.setHead("建造车头");
    }

    @Override
    public void builderCenter() {
        car.setCenter("建造车中间");
    }

    @Override
    public void builderTail() {
        car.setTail("建造车尾巴");
    }

    public Car builderCar(){
        return car;
    }
}
