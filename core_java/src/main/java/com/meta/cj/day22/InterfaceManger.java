package com.meta.cj.day22;

import java.util.List;

interface Game{
    public void start();
    public void play();
    public void stop();

}

abstract class AbstractGame implements Game{
    @Override
    public void start(){
        System.out.println(this.getClass().getSimpleName() + " is going to start");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " is going to stop");
    }
}


class Bike extends AbstractGame implements Game{
    public void play() {
        System.out.println(this.getClass().getSimpleName()+" is in play, please wear a helmet");
    }
}

class Car extends AbstractGame implements  Game{
    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " is in play, please wear seat belt");
    }
}

class Ship extends AbstractGame implements  Game{
    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " is in play, please wear life jacket");
    }
}
public class InterfaceManger {
    public static void main(String[] args) {
        List<Game> games = List.of(new Bike(),new Car(), new Ship(), new Car());

        for( Game game : games){
            game.start();
            game.play();
            game.stop();
            System.out.println("-".repeat(20));
        }
    }
}
