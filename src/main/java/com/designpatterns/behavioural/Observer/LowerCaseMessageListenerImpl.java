package com.designpatterns.behavioural.Observer;

public class LowerCaseMessageListenerImpl extends Listener{

    public LowerCaseMessageListenerImpl(Queue queue) {
        super(queue);
        queue.addListener(this);
    }

    @Override
    public void update() {
        System.out.println("LowerCaseMessageListenerImpl "+queue.getMessage().toLowerCase());
    }
}
