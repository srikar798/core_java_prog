package com.meta.cj.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountService {

    private final List<Account> accountList = new ArrayList<>();
    public void addAccount(Account account){
        if(!isAccountExist(account.getAccNumber())){
            accountList.add(account);
        }else{
            System.out.println("Account already exist with number :"+ account.getAccNumber());
        }
    }

    public void withdrawAmount(String accountNumber, double amount){

    }

    public void showAllAccounts
    private Optional<Account> getAccount(String accNumber){
        for(Account acc:accountList){
            if(acc.getAccNumber().equals(accNumber)){
                return Optional.of(acc);
            }
            return Optional.empty();
        }
    }
    private boolean isAccountExist(String accNumber){
        for( Account account : accountList){
            if (account.accNumber == accNumber){
                return true;
            }
        }
    }
}
