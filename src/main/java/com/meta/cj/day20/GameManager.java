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

class Ship extends Game{
    @Override
    public void play(){
        System.out.println("Ship game started");
    }
}

abstract class HttpServlet{
    void get(){

    }

    void post(){

    }
}

class MyServlet extends HttpServlet{

}

public class GameManager {

    public static void main(String[] args) {
        Game[] arr = new Game[]{new Bike(),new Car(),new Ship(),new Car(),new Bike(),new Ship(),new Car(),new Bike(),new Ship()};
        int count = 0;
        for(Game game : arr){
            if(game instanceof Car){
                count++;
            }
        }
        System.out.println(count);
    }
}
