package com.designpatterns.structural.Facade;

public class ShapeFacade {


    private Shape shape;


    public void drawSquare(float side){
        shape = new Square(side);
        shape.draw();
    }

    public void drawRectangle(float length,float breadth){
        shape= new Rectangle(length,breadth);
        shape.draw();
    }

    public void drawCircle(float radius){
        shape= new Circle(radius);
        shape.draw();
    }

}
