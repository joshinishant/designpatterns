package com.designpatterns.structural.Decorator;

public class ThinCrustPizza implements Pizza {


    @Override
    public double addToppingAndCalculatePrice() {
        return 22;
    }

}
