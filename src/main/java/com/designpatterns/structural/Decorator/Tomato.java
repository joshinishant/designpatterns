package com.designpatterns.structural.Decorator;

public class Tomato extends PizzaToppings {


    private double pricePerPortion = 15.25;
    private int portions;


    public int getPortions() {
        return portions;
    }

    public Tomato(int portions, Pizza pizza) {
        super(pizza);
        this.portions = portions;
    }

    @Override
    public double addToppingAndCalculatePrice() {
        return pricePerPortion*portions+pizza.addToppingAndCalculatePrice();
    }
}
