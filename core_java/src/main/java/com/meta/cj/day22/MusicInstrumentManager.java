package com.meta.cj.day22;

import lombok.SneakyThrows;

import java.util.Scanner;

interface MusicInstrucment{
    String brandName = "Yamaha"; // public static final String brandName = "Yamaha";
    void sound();  // public abstract void sound();
}

class Piano implements MusicInstrucment{
    @Override
    public void sound() {
        System.out.println("Piano Sound");
    }
}

class Guitar implements MusicInstrucment{
    @Override
    public void sound() {
        System.out.println("Guitar Sound");
    }
}

class Violin implements MusicInstrucment{
    @Override
    public void sound() {
        System.out.println("Violin Sound");
    }
}

class Flute implements  MusicInstrucment{
    @Override
    public void sound() {
        System.out.println("Flute Sound");
    }
}
public class MusicInstrumentManager {

    public static void main(String[] args) {
        MusicInstrucment ref = getMusicInstument();
        ref.sound();
    }

    @SneakyThrows
    public static MusicInstrucment getMusicInstument(){

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Piano 2.Guitar 3.Flute 4.Violin");
        int s = sc.nextInt();
        MusicInstrucment obj = switch (s)
        {
            case 1 -> new Piano();
            case 2 -> new Guitar();
            case 3 -> new Flute();
            case 4 -> new Violin();
            default -> throw new IllegalAccessException("Invalid value: " + s );
        };
        return obj;
    }
}
