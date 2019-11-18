package com.designpatterns.creational.abstractfactory;

public class Demo {


    public static void main(String[] args){

      AbstractFactory factory=  FactoryProducer.getFactory("ROUNDED");
      factory.getShape("RECTANGLE").draw();
        factory.getShape("CIRCLE").draw();

         factory=  FactoryProducer.getFactory("");
        factory.getShape("RECTANGLE").draw();
        factory.getShape("CIRCLE").draw();
    }



}
