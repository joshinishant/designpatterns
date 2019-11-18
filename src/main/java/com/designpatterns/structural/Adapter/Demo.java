package com.designpatterns.structural.Adapter;

public class Demo {

    public  static void main(String[] args){


        AudioPlayer audioPlayer= new AudioPlayer();

        audioPlayer.play("mp3","I am awesome");
        audioPlayer.play("mp4","I am awesome");
        audioPlayer.play("vlc","I am awesome");
        audioPlayer.play("avi","I am awesome");
    }
}
