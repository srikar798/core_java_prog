package com.career.wsp.controller;

import com.career.wsp.dto.TransactionDto;
import com.career.wsp.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping("/transfer")
    public ResponseEntity<TransactionDto> transferAmount(@RequestBody TransactionDto transactionDto){
        return ResponseEntity.ok(transactionService.transferAmount(transactionDto));
    }
}
