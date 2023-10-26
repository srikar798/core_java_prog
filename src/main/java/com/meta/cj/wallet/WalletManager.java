package com.meta.cj.wallet;

import java.util.Scanner;

public class WalletManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WalletService walletService= new WalletServiceImpl(); // TODO : Create object for WalletServiceImpl

        while (true){
            System.out.println("1. Create account");
            System.out.println("2. Transfer amount");
            System.out.println("3. Add amount");
            System.out.println("4. Show wallet");
            System.out.println("5. Show all wallets");
            System.out.println("6. Exit");
            System.out.println("Enter your choice :");
            int ch = sc.nextInt();
            String mobile=null;
            double amount=0;
            WalletService walletService1 = new WalletServiceImpl();
            try {
                switch (ch) {
                    case 1:
                        System.out.println("Enter the mobile number :");
                        mobile = sc.next();
                        System.out.println("Enter the amount :");
                        amount = sc.nextDouble();

                        try {
                            walletService.createWallet(mobile, amount);
                            System.out.println("Wallet created successfully.");
                        } catch (RuntimeException e) {
                            System.out.println("Failed to create wallet: " + e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.println("Enter the from mobile number :");
                        String fromMobile = sc.next();
                        System.out.println("Enter the to mobile number :");
                        String toMobile = sc.next();
                        System.out.println("Enter the amount :");
                        double transferAmount = sc.nextDouble();

                        try {
                            walletService.transferAmount(fromMobile, toMobile, transferAmount);
                            System.out.println("Transfer successful.");
                        } catch (RuntimeException e) {
                            System.out.println("Transfer failed: " + e.getMessage());
                        }
                        // TODO : call transferAmount method
                        break;
                    case 3:
                        System.out.println("Enter the mobile number :");
                        mobile = sc.next();
                        System.out.println("Enter the amount :");
                        amount = sc.nextDouble();
                        try {
                            walletService.addAmount(mobile, amount);
                            System.out.println("Amount added successfully.");
                        } catch (RuntimeException e) {
                            System.out.println("Failed to add amount: " + e.getMessage());
                        }
                        // TODO : call addAmount method
                        break;
                    case 4:
                        System.out.println("Enter the mobile number :");
                        mobile = sc.next();
                        try {
                            Wallet wallet = walletService.getWallet(mobile);
                            wallet.showInfo();
                        } catch (RuntimeException e) {
                            System.out.println("Wallet not found: " + e.getMessage());
                        }
                        // TODO : call getWallet method
                        break;
                    case 5:
                        walletService1.showWallets();
                        // TODO : call showWallets method
                        break;

                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
            }
        }
    }
