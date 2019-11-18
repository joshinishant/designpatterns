package com.designpatterns.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }
        else if("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Circle();
        }

        return null;
    }
}
