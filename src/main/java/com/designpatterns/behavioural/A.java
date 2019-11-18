package com.designpatterns.behavioural;

import com.designpatterns.behavioural.Strategy.*;

public class A {

    public static void main(String[] args){

        Context context= new Context(new Addition());
        System.out.println(" Result of operation "+context.executeOperation(10,2));

        context= new Context(new Substraction());
        System.out.println(" Result of operation "+context.executeOperation(10,2));

        context= new Context(new Multiplication());
        System.out.println(" Result of operation "+context.executeOperation(10,2));

        context= new Context(new Division());
        System.out.println(" Result of operation "+context.executeOperation(10,2));

    }
}
