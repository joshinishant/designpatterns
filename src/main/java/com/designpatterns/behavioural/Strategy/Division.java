package com.designpatterns.behavioural.Strategy;

public class Division implements Strategy {
    @Override
    public float doOperation(float a, float b) {
        if(b==0)
            return 0;
        return a/b;
    }
}
