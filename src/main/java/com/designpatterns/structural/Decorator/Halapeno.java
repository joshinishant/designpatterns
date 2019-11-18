package com.designpatterns.structural.Decorator;

public class Halapeno extends PizzaToppings {


    private double pricePerPortion = 18.95;
    private int portions;

    public int getPortions() {
        return portions;
    }


    public Halapeno(int portions, Pizza pizza) {
        super(pizza);
        this.portions = portions;
    }


    @Override
    public double addToppingAndCalculatePrice() {
        return pricePerPortion*portions+pizza.addToppingAndCalculatePrice();
    }
}
