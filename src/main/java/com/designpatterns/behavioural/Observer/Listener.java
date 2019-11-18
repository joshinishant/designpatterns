package com.designpatterns.behavioural.Observer;

public abstract class Listener {

    protected Queue queue;

    public Listener(Queue queue) {
        this.queue = queue;
    }


    public abstract void update();
}
