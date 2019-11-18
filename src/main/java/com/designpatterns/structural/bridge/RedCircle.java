package com.designpatterns.structural.bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(float radius,float x,float y) {
        System.out.println("Red Circle with Center ("+x+","+y+") and radius " +radius);
    }
}
