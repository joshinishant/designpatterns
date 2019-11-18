package com.designpatterns.structural.Adapter;

public class MP4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {
        System.out.println("Not played in MP4 player");
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing "+filename+" in MP4Format");
    }
}
