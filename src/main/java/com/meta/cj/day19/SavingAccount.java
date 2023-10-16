package com.meta.cj.day19;

public class SavingAccount extends Account {

    private final double minBalance;

    public SavingAccount(String accNumber, String name, double balance, double minBalance) {
        super(accNumber, name, balance);
        this.minBalance = minBalance;
    }


    @Override
    public void withdraw(double amount){
        if(amount <= balance - minBalance){
            balance -= amount;
            System.out.println("Amount "+amount + " is debited from your account and your account balance is "+ balance);
        }else{
            System.out.println("Insufficient funds");
        }
    }

}
