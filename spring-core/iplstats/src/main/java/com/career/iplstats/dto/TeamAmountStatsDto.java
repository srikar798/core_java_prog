package com.career.iplstats.dto;

import lombok.*;

@Data
@AllArgsConstructor@NoArgsConstructor
@Builder
public class TeamAmountStatsDto {
    private String teamName;
    private double totalAmount;
}
