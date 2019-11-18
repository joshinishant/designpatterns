package com.designpatterns.behavioural.Strategy;

public class Substraction implements Strategy {
    @Override
    public float doOperation(float a, float b) {
        return a-b;
    }
}
