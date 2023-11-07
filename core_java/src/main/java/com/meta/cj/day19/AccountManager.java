package com.meta.cj.day19;

import java.util.Scanner;

public class AccountManager {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("-----Bank Application-------");
            System.out.println("1.Create Account");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.SHow Info");
            System.out.println("5.Delete Account");
            System.out.println("6.Update Account");
            System.out.println("7.Show all accounts");
            System.out.println("8.Exit");
            System.out.println("Enter your Choice :");
            int ch = sc.nextInt();
            String accNumber;
            String name;
            switch(ch){
                case 1:
                    System.out.println("Enter the account type 1. Savings 2.Current :");
                    int option = sc.nextInt();
                    if(option==1){
                        System.out.println("Enter the account number :");
                        accNumber = sc.next();
                        System.out.println("Enter the name :");
                        name = sc.next();
                        System.out.println("Enter the balance:");
                        double balance = sc.nextDouble();
                        System.out.println("Enter the minBalance :");
                        double minBalance = sc.nextDouble();
                        SavingAccount acc = new SavingAccount(accNumber,name,balance,minBalance);
                        accountService.addAccount(acc);
                    }else if(option==2){
                        System.out.println("Enter the account number :");
                        accNumber = sc.next();
                        System.out.println("Enter the name :");
                        name = sc.next();
                        System.out.println("Enter the balance:");
                        double balance = sc.nextDouble();
                        System.out.println("Enter the overdraft :");
                        double overdraft = sc.nextDouble();
                        CurrentAccount acc = new CurrentAccount(accNumber,name,balance,overdraft);
                        accountService.addAccount(acc);
                    }else{
                        System.out.println("Invalid option");
                    }
                    break;
                case 2:
                    System.out.println("Enter the account number :");
                    accNumber = sc.next();
                    System.out.println("Enter the amount to withdraw:");
                    double amount = sc.nextDouble();
                    accountService.withdrawAmount(accNumber,amount);
                    break;
                case 3:
                    System.out.println("Enter the account number");
                    accNumber = sc.next();
                    System.out.println("Enter the amount to deposit:");
                    amount = sc.nextDouble();
                    accountService.depositAmount(accNumber,amount);
                    break;
                case 4:
                    System.out.println("Enter the account number:");
                    accNumber = sc.next();
                    accountService.showAccountInfo(accNumber);
                    break;
                case 5:
                    System.out.println("Enter the account number:");
                    accNumber = sc.next();
                    accountService.deleteAccount(accNumber);
                    break;
                case 6:
                    System.out.println("Enter the account number:");
                    accNumber = sc.next();
                    System.out.println("Enter the name:");
                    name = sc.next();
                    accountService.updateNameAccount(accNumber,name);
                    break;
                case 7:
                    accountService.showAllAccountsInfo();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}
