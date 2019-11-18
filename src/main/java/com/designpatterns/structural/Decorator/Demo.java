package com.designpatterns.structural.Decorator;

public class Demo {

    public static void main(String[] args){
        Pizza pizza= new Onion(2,new Cheese(1,new Tomato(2,new ThinCrustPizza())));
        System.out.println(pizza.addToppingAndCalculatePrice());
    }
}
