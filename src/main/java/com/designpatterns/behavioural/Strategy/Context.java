package com.designpatterns.behavioural.Strategy;

public class Context {

    private Strategy strategy;


    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public float executeOperation(float a,float b){
       return strategy.doOperation(a,b);
    }

}
