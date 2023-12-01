package com.career.iplstats.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TeamAmountStatsDto {
    private String teamName;
    private BigDecimal totalAmount;
}
