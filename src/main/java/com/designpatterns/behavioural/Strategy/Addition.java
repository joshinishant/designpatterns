package com.designpatterns.behavioural.Strategy;

public class Addition implements Strategy {
    @Override
    public float doOperation(float a, float b) {
        return a+b;
    }
}
