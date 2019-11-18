package com.designpatterns.structural.Facade;

public class Rectangle implements Shape {


    private float length;
    private float breadth;


    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with Length "+length+" Breadth "+breadth);
    }
}
