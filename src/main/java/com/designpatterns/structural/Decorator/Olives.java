package com.designpatterns.structural.Decorator;

public class Olives extends PizzaToppings {


    private double pricePerPortion = 12;
    private int portions;


    public int getPortions() {
        return portions;
    }

    public Olives(int portions, Pizza pizza) {
        super(pizza);
        this.portions = portions;
    }


    @Override
    public double addToppingAndCalculatePrice() {
        return pricePerPortion*portions;
    }
}
