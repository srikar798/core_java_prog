package com.meta.cj.wallet;

import com.meta.cj.day19.Account;
import com.meta.cj.quiz.WalletExists;
import lombok.SneakyThrows;

import java.util.Optional;

import java.util.ArrayList;
import java.util.List;

public class WalletServiceImpl implements WalletService {

    static List<Wallet> wallets = new ArrayList<>();

   // public WalletServiceImpl() {}


    @Override
    public void createWallet(String mobile, double amount) {
        // Check if a wallet with the given mobile number already exists
        for (Wallet wallet : wallets) {
            if (wallet.getMobile().equals(mobile)) {
                throw new RuntimeException("Wallet with this mobile number already exists.");
            }
        }

        // If not, create a new wallet
        Wallet newWallet = new Wallet(mobile,amount);
        wallets.add(newWallet);
    }

    @Override
    public void transferAmount(String fromMobile, String toMobile, double amount) {
        Wallet senderWallet = null;
        Wallet receiverWallet = null;

        // Find the sender's wallet and receiver's wallet
        for (Wallet wallet : wallets) {
            if (wallet.getMobile().equals(fromMobile)) {
                senderWallet = wallet;
            } else if (wallet.getMobile().equals(toMobile)) {
                receiverWallet = wallet;
            }
        }

        // Check if the sender's wallet and receiver's wallet exist
        if (senderWallet == null || receiverWallet == null) {
            throw new WalletNotFoundException("Either sender or receiver wallet does not exist.");
        }

        // Check if the sender has sufficient balance
        if (senderWallet.getBalance() < amount) {
            throw new InsufficientFundsException("Insufficient funds in the sender's wallet.");
        }



        // Perform the transfer
        senderWallet.withdraw(amount);
        receiverWallet.add(amount);
    }

    @Override
    public void addAmount(String mobile, double amount) {
        Wallet walletToUpdate = null;

        // Find the wallet to update
        for (Wallet wallet : wallets) {
            if (wallet.getMobile().equals(mobile)) {
                walletToUpdate = wallet;
                break;
            }
        }

        // If the wallet doesn't exist, throw an exception
        if (walletToUpdate == null) {
            throw new RuntimeException("Wallet with this mobile number does not exist.");
        }

        // Add the specified amount to the wallet
        walletToUpdate.add(amount);
    }

    @Override
    public Wallet getWallet(String mobile) {
        // Find and return the wallet with the given mobile number
        for (Wallet wallet : wallets) {
            if (wallet.getMobile().equals(mobile)) {
                return wallet;
            }
        }

        // If the wallet doesn't exist, throw an exception
        throw new RuntimeException("Wallet with this mobile number does not exist.");
    }

    @Override
    public void showWallets() {
        if(wallets.isEmpty()){
            System.out.println("There are no wallets");
            return;
        }
        // Display information about all wallets
        for (Wallet wallet : wallets) {
            wallet.showInfo();
        }
    }
}
