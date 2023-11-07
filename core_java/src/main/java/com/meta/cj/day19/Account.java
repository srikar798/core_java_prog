package com.meta.cj.day19;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {

    String accNumber;
    String name;
    double balance;

    public Account(String accNumber,String name,double balance){
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Amount "+amount+" is debited from your account and your current balance is "+balance);
        }else{
            System.out.println("Sorry! Insufficient funds");
        }
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount "+amount+" is credited to your account and your current balance is "+balance);
    }

    public void showInfo(){
        System.out.println("Account Number :"+accNumber);
        System.out.println("Name           :"+name);
        System.out.println("Balance        :"+balance);

    }

}