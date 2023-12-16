package com.career.wsp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {

    private UUID id;
    private UUID fromWalletId;
    private UUID toWalletId;
    private double amount;
}
