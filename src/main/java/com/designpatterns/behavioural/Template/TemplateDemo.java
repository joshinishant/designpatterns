package com.designpatterns.behavioural.Template;

public class TemplateDemo {


    public static void main(String[] args){
        TemplateGame cricket= new Cricket();
        cricket.game();

        TemplateGame football= new Football();
        football.game();
    }
}
