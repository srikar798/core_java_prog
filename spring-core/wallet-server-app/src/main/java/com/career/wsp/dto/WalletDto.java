package com.career.wsp.dto;

import lombok.*;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletDto {

    private UUID id;
    private double balance;
    private UUID userId;

}
