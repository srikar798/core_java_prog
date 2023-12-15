package com.career.wsp.controller;

import com.career.wsp.dto.WalletDto;
import com.career.wsp.service.WalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wallet")
@RequiredArgsConstructor
public class WalletController {

    private final WalletService walletService;

    @PostMapping
    public ResponseEntity<WalletDto> createWallet(@RequestBody WalletDto walletDto) {
        WalletDto createdWallet = walletService.createWallet(walletDto);
        return ResponseEntity.ok(createdWallet);
    }
}
