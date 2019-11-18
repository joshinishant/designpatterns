package com.designpatterns.structural.Decorator;

public abstract class PizzaToppings implements Pizza {

    protected Pizza pizza;

    public PizzaToppings(Pizza pizza) {
       this.pizza = pizza;
    }

}
