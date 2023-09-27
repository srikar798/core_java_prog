package com.meta.cj.day8;

public class AccountManager {
    public static void main(String[] args) {

        Account a = new Account(1001, "Srikar", 5000);
        Account acc1 = new Account(1001, "Krish", 5000);
        Account acc2 = new Account(1002, "Manoj", 6000);
        a.checkInfo();
        acc1.checkInfo();
        acc2.checkInfo();
    }


}
