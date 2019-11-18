package com.designpatterns.behavioural.Observer;

public class ObserverDemo {

    public static void main(String[] args){
    Queue  queue= new Queue();

    new UpperCaseMessageListenerImpl(queue);
    new LowerCaseMessageListenerImpl(queue);

    String message="First Message";
    System.out.println(" Message Sent "+message);
    queue.setMessage(message);

    message="Second Message";
    System.out.println(" Message Sent "+message);
    queue.setMessage(message);
    }
}
