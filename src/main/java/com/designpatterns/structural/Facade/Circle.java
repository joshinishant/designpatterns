package com.designpatterns.structural.Facade;

public class Circle implements Shape {


    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius "+radius);
    }
}
