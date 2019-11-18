package com.designpatterns.structural.Facade;

public class Square implements Shape {


    private float side;


    public Square(float side) {
        this.side=side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with side "+side);
    }
}
