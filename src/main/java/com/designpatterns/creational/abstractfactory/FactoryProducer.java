package com.designpatterns.creational.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType){
        if("Rounded".equalsIgnoreCase(factoryType)){
            return new RoundedShapeFactory();
        }
        else{
            return new ShapeFactory();
        }
    }
}
