package com.designpatterns.behavioural.Template;

import java.util.Random;

public class Cricket extends TemplateGame {


    @Override
    public void toss() {
        if(new Random().nextInt() > 100){
            System.out.println("Toss won by Team 1");
        }else {
            System.out.println("Toss won by Team 2");
        }
    }

    @Override
    public void play() {
        team1score=new Random().nextInt();
        team2Score=new Random().nextInt();
    }

    @Override
    public void declareResult() {

        System.out.println("Score Team 1 "+team1score+" and Team 2 "+team2Score);

        if(team2Score>team1score){
            System.out.println("Game won by Team 2");
        }
        else {
            System.out.println("Game won by Team 1");
        }
    }
}
