package com.meta.cj.day19;

public class CurrentAccount extends Account {


    private final double overDraft;

    public CurrentAccount(String accNumber, String name, double balance, double overDraft) {
        super(accNumber, name, balance);
        this.overDraft = overDraft;
    }
    @Override
    public void withdraw(double amount){
        if(amount <= balance + overDraft){
            balance -= amount;
            System.out.println("Amount "+amount + " is debited from your account and your account balance is "+ balance);
        }else{
            System.out.println("Insufficient funds");
        }
    }
}
