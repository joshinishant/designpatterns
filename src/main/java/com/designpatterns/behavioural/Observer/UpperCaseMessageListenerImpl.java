package com.designpatterns.behavioural.Observer;

public class UpperCaseMessageListenerImpl extends Listener{

    public UpperCaseMessageListenerImpl(Queue queue) {
        super(queue);
        queue.addListener(this);
    }

    @Override
    public void update() {
        System.out.println("UpperCaseMessageListenerImpl "+queue.getMessage().toUpperCase());
    }
}
