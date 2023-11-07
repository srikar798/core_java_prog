package com.meta.cj.day24;

public class Account {

    private int accno;
    private String name;
    private double balance;

    public Account(int accno, String name, double balance){
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw( double amount){
        if( amount > balance){
            throw  new InsufficientFundsException("Insufficient balance");
        }else balance -= amount;
    }

    public void deposit( double amount){
        balance += amount;
    }
}
