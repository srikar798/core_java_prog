package com.career.wsp.service;

import com.career.wsp.domain.Wallet;
import com.career.wsp.dto.WalletDto;
import com.career.wsp.repo.AppUserRepo;
import com.career.wsp.repo.WalletRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@RequiredArgsConstructor
@Service
@Slf4j
public class WalletServiceImpl implements WalletService{

    private final WalletRepo walletRepo;

    private final AppUserRepo appUserRepo;
    @Override
    @Transactional
    public WalletDto createWallet(WalletDto walletDto) {
        Assert.notNull(walletDto,"WalletDto can't be null");
        Assert.notNull(walletDto.getUserId(),"UserId can't be null");
        if(!appUserRepo.existsById(walletDto.getUserId())){
            log.error("User not found with id : {}", walletDto.getUserId());
            throw new RuntimeException("User not found with id"+ walletDto.getUserId());
        }
        if(walletRepo.existsByUserId(walletDto.getUserId())){
            log.error("Wallet already exists for user : {}", walletDto.getUserId());
            throw new RuntimeException("Wallet already exists for user :"+ walletDto.getUserId());
        }
        Wallet wallet = new Wallet();
        wallet.setAppUser(appUserRepo.findById(walletDto.getUserId()).get());
        wallet.setBalance(walletDto.getBalance());
        walletRepo.save(wallet);
        walletDto.setId(wallet.getId());
        log.info("Wallet is created with id : {} ", walletDto.getId());
        return walletDto;
    }
}
