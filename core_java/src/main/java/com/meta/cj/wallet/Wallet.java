package com.meta.cj.wallet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wallet {
    private String mobile;
    private double balance;

    public Wallet(String mobile, double balance) {
        this.mobile = mobile;
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(amount > balance){
            throw new InsufficientFundsException("Insufficient funds");
        }
        else{
            balance -= amount;
            System.out.println("Amount "+ amount + " is debited from your wallet and your current balance is "+ balance);
        }
    }

    public void add(double amount){
        balance += amount;
        System.out.println("Amount "+ amount + " is credited to your wallet and your current balance is "+ balance);
    }

    public void showInfo(){
        System.out.println("mobile :" + mobile);
        System.out.println("balance :" + balance);
    }

}
