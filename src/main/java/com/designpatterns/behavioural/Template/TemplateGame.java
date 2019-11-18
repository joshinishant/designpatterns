package com.designpatterns.behavioural.Template;

public abstract class TemplateGame {

    protected int team1score;
    protected int team2Score;

    public void game(){
        toss();
        play();
        declareResult();
    }

    public abstract void toss();
    public abstract void play();
    public abstract void declareResult();

}
