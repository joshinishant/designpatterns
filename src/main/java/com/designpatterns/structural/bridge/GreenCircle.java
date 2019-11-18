package com.designpatterns.structural.bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(float radius,float x,float y) {
        System.out.println("Green Circle with Center ("+x+","+y+") and radius " +radius);
    }
}
