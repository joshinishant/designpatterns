package com.designpatterns.structural.Adapter;

public class VLCPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing "+filename+" in VLCFormat");
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Not played in VLC player");
    }
}
