package com.designpatterns.creational.abstractfactory;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new RoundedRectangle();
        }
        else if("CIRCLE".equalsIgnoreCase(shapeType)){
            return new RoundedCircle();
        }

        return null;
    }
}
