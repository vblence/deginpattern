package com.degin.pattern.builder;

public class Director {
    public Builder constructProduct(Builder builder) {
        builder.builderHead();
        builder.builderCenter();
        builder.builderTail();

        return builder;
    }
}
