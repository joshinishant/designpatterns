package com.designpatterns.structural.bridge;

public class Demo {


    public static void main(String[] args){

        GreenCircle gc= new GreenCircle();
        RedCircle rc= new RedCircle();

        Circle circle= new Circle(gc,11,2,3);
        circle.draw();

        circle= new Circle(rc,9,3,2);
        circle.draw();
    }
}
