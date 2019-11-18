package com.designpatterns.structural.Adapter;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType,String filename) {

        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing "+filename+" from MP3 player");
        }
        else{
            if("mp4".equalsIgnoreCase(audioType)){
                mediaAdapter=new MediaAdapter("mp4");
                mediaAdapter.play(audioType,filename);
            }
            else if("vlc".equalsIgnoreCase(audioType)){
                mediaAdapter=new MediaAdapter("vlc");
                mediaAdapter.play(audioType,filename);
            }
            else{
                System.out.println(audioType + " is not supported y this audio player");
            }
        }

    }
}
