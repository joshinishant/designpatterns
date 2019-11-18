package com.designpatterns.structural.Decorator;

public class DecoratorPattern extends PizzaToppings {


    public DecoratorPattern(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double addToppingAndCalculatePrice() {
        return pizza.addToppingAndCalculatePrice();
    }

}
