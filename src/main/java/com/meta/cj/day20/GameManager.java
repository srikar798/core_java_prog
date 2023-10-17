package com.meta.cj.day20;

abstract class Game{
    public void start(){
        System.out.println("Game started");
    }
    public abstract void play();
    public void stop(){
        System.out.println("Game stopped");
    }
}

class Bike extends Game{
    @Override
    public void play(){
        System.out.println("Bike game is started");
    }
}

class Car extends Game{
    @Override
    public void play(){
        System.out.println("Car game is started");
    }
}
public class GameManager {

    public static void main(String[] args) {
        Game game = new Car();
        game.start();
        game.play();
        game.stop();
    }
}
