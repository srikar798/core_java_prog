package com.meta.cj.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountService {

    private final List<Account> accountList = new ArrayList<>();
    public void addAccount(Account account){
        if(!isAccountExist(account.getAccNumber())){
            accountList.add(account);
            System.out.println("Account is created with the number :" + account.getAccNumber());
        }else{
            System.out.println("Account already exist with number :"+ account.getAccNumber());
        }
    }

    public void withdrawAmount(String accountNumber, double amount){
        Optional<Account> optionalAccount = getAccount(accountNumber);
        if(optionalAccount.isPresent()){
            Account account = optionalAccount.get();
            account.withdraw(amount);
        }else{
            System.out.println("Account with number " +accountNumber + " is not found");
        }
    }

    public void depositAmount(String accountNumber, double amount){
        Optional<Account> optionalAccount = getAccount(accountNumber);
        if(optionalAccount.isPresent()){
            Account account = optionalAccount.get();
            account.deposit(amount);
        }else{
            System.out.println("Account with number " +accountNumber + " is not found");
        }
    }

    public void showAccountInfo(String accountNumber){
        Optional<Account> optionalAccount = getAccount(accountNumber);
        if(optionalAccount.isPresent()){
            Account account = optionalAccount.get();
            account.showInfo();
        }else{
            System.out.println("Account with number " +accountNumber + " is not found");
        }
    }

    public void  updateNameAccount(String accountNumber, String name){
        Optional<Account> optionalAccount = getAccount(accountNumber);
        if(optionalAccount.isPresent()){
            Account account = optionalAccount.get();
            account.setName(name);
            System.out.println("Account with number " + accountNumber + " is updated with name " + name  );
        }else{
            System.out.println("Account with number " +accountNumber + " is not found");
        }
    }
    public void showAllAccountsInfo(){
        if(accountList.isEmpty()) {
            System.out.println("Accounts are not found, please add accounts to view");
            return;
        }
        for(Account acc:accountList){
            acc.showInfo();
            System.out.println("-----------------------------");
        }
    }
    public void deleteAccount(String accountNumber){
        Optional<Account> optionalAccount = getAccount(accountNumber);
        if(optionalAccount.isPresent()){
            Account account = optionalAccount.get();
            accountList.remove(account);
            System.out.println("Account with number " + accountNumber + " is deleted ");
        }else{
            System.out.println("Account with number " +accountNumber + " is not found");
        }
    }

    private Optional<Account> getAccount(String accNumber){
        for(Account acc:accountList){
            if(acc.getAccNumber().equals(accNumber)) {
                return Optional.of(acc);
            }
        }
        return Optional.empty();
    }
    private boolean isAccountExist(String accNumber){
        for( Account account : accountList){
            if (account.accNumber.equals(accNumber)){
                return true;
            }
        }
        return false;
    }
}
