package com.meta.cj.day8;

public class TvRemote {

    private int volume;
    private boolean state;
    private int channel;
    private int tempVolume;

    public TvRemote(){
        this.state = false;
        this.volume = 10;
        this.channel = 10;
    }
    public void on(){
        state = true;
        this.volume = 10;
        this.channel = 100;
        System.out.println("TV is switched on");
    }

    public void off(){
        state = false;
        this.volume = 0;
        this.channel = 0;
        System.out.println("TV is switched off");
    }

    public void mute(){
        tempVolume = volume;
        volume = 0;
        System.out.println("TV is muted");
    }

    public void unMute(){
        volume = tempVolume;
        tempVolume = 0;
        System.out.println("TV is unMuted");
    }

    public void volumeUp(){
        if( tempVolume != 0){
            volume = tempVolume + 1 ;
            System.out.println("Volume is increased to : " + volume);
        }else {
            volume++;
            System.out.println("Volume is increased to : " + volume);
        }

    }

    public void volumeDown(){
        if( tempVolume != 0){
            volume = tempVolume - 1 ;
            System.out.println("Volume is decreased to : " + volume);
        }else {
            volume--;
            System.out.println("Volume is decreased to : " + volume);
        }
    }

    public void changeChannel(){
        channel++;
        System.out.println("Channel is changed to : " + channel);
    }

    public void showInfo(){
        System.out.println("State :" + state);
        System.out.println("Volume :" + volume);
        System.out.println("Channel :" + channel);
    }

    public static void main(String[] args){
        TvRemote tvRemote = new TvRemote();
        tvRemote.on();
        tvRemote.volumeDown();
        tvRemote.showInfo();
        tvRemote.mute();
        tvRemote.volumeUp();
        tvRemote.showInfo();
    }
}
