package com.designpatterns.behavioural.Observer;

import java.util.LinkedList;
import java.util.List;

public class Queue {

    private List<Listener> listenerList= new LinkedList<Listener>();
    private String message;

    public void addListener(Listener listener) {
        this.listenerList.add(listener);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllListeners();
    }

    private void notifyAllListeners(){
        for(Listener listener:this.listenerList){
            listener.update();
        }
    }
}
