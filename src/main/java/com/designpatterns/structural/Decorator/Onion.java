package com.designpatterns.structural.Decorator;

public class Onion extends PizzaToppings {


    private double pricePerPortion = 18.35;
    private int portions;


    public int getPortions() {
        return portions;
    }

    public Onion(int portions, Pizza pizza) {
        super(pizza);
        this.portions = portions;
    }


    @Override
    public double addToppingAndCalculatePrice() {
        return pricePerPortion*portions+pizza.addToppingAndCalculatePrice();
    }
}
