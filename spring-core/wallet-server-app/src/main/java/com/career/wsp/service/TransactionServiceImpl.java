package com.career.wsp.service;

import com.career.wsp.domain.Transaction;
import com.career.wsp.domain.Wallet;
import com.career.wsp.dto.TransactionDto;
import com.career.wsp.repo.AppUserRepo;
import com.career.wsp.repo.TransactionRepo;
import com.career.wsp.repo.WalletRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService{

    private final AppUserRepo appUserRepo;
    private final WalletRepo walletRepo;
    private final TransactionRepo transactionRepo;
    @Override
    public TransactionDto transferAmount(TransactionDto transactionDto) {
        Assert.notNull(transactionDto,"TransactionDto can't be null");
        Assert.notNull(transactionDto.getFromWalletId(),"FromWalletId can't be null");
        Assert.notNull(transactionDto.getToWalletId(),"ToWalletId can't be null");
        Optional<Wallet> optionalFromWallet = walletRepo.findById(transactionDto.getFromWalletId());
        Optional<Wallet> optionalToWallet = walletRepo.findById(transactionDto.getFromWalletId());
        if (optionalFromWallet.isEmpty()) {
            throw new RuntimeException("From wallet not found with id : " + transactionDto.getFromWalletId());
        }
        if (optionalToWallet.isEmpty()) {
            throw new RuntimeException("To wallet not found with id : " + transactionDto.getToWalletId());
        }
        Wallet fromWallet = optionalFromWallet.get();
        if(fromWallet.getBalance() < transactionDto.getAmount()){
            throw new RuntimeException("Insufficient balance in from user wallet");
        }
        Wallet toWallet = optionalToWallet.get();
        fromWallet.setBalance(fromWallet.getBalance() - transactionDto.getAmount());
        toWallet.setBalance(toWallet.getBalance() + transactionDto.getAmount());
        Transaction transaction = new Transaction();
        transaction.setAmount(transactionDto.getAmount());
        transaction.setFromWalletId(transactionDto.getFromWalletId());
        transaction.setToWalletId(transactionDto.getToWalletId());
        walletRepo.save(fromWallet);
        walletRepo.save(toWallet);
        transactionRepo.save(transaction);
        transactionDto.setId(transaction.getId());
        return transactionDto;
    }
}
