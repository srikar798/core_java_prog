package com.meta.cj.day15;

public class PlayerClass {

    private int id;
    private String name;
    private String team;
    private double price;
    private PlayerRoles role;

    public PlayerClass(int id, String name, String team, double price, PlayerRoles role) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.price = price;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public double getPrice() {
        return price;
    }

    public PlayerRoles getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", price=" + price +
                ", role=" + role;
    }
}
