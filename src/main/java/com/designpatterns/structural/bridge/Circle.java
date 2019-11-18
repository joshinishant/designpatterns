package com.designpatterns.structural.bridge;

public class Circle extends Shape {

    private float radius;
    private float y;
    private float x;

    public Circle(DrawAPI drawAPI,float radius, float x, float y) {
        super(drawAPI);
        this.radius=radius;
        this.x=x;
        this.y=y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
