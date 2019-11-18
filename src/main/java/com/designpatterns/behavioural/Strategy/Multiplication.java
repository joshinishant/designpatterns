package com.designpatterns.behavioural.Strategy;

public class Multiplication implements Strategy {
    @Override
    public float doOperation(float a, float b) {
        return a*b;
    }
}
