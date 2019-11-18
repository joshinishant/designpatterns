package com.designpatterns.structural.Facade;

public class Demo {

    public static void main(String[] args ){
        ShapeFacade shapeFacade= new ShapeFacade();

        shapeFacade.drawCircle(10);
        shapeFacade.drawRectangle(20,30);
        shapeFacade.drawSquare(11);
    }
}
