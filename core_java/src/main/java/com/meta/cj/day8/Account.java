package com.meta.cj.day8;

public class Account {
    private int accNumber;
    private String name;
    private double balance;
    public Account(int accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount){
        if( amount <= balance ){
            balance -= amount;
            System.out.println("Amount " + amount + " is debited from your account and the current balance is " + balance);
        }else{
            System.out.println("Insufficient Account balance");
        }
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount of " + amount + " was deposited into your account. Your new balance is " + balance );
    }

    public void checkInfo(){
        System.out.println("The Account number is : " + accNumber);
        System.out.println("The name of the account holder is : " + name);
        System.out.println("The Account balance is : " + balance);
    }
}
