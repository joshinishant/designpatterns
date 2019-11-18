package com.designpatterns.structural.Decorator;

public class PlainPizza implements Pizza {


    @Override
    public double addToppingAndCalculatePrice() {
        return 11;
    }


}
