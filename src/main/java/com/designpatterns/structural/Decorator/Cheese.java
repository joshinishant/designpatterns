package com.designpatterns.structural.Decorator;

public class Cheese extends PizzaToppings {


    private double pricePerPortion = 35.10;
    private int portions;

    public Cheese(int portions, Pizza pizza) {
        super(pizza);
        this.portions = portions;
    }

    public int getPortions() {
        return portions;
    }

    @Override
    public double addToppingAndCalculatePrice() {
        return pricePerPortion*portions+pizza.addToppingAndCalculatePrice();
    }

}
