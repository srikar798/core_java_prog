package org.jdbc.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class TeamStatsDto {

    private String teamName;
    private int playerCount;
    private double totalAmount;
    private double minAmount;
    private double maxAmount;
    private double avgAmount;
}
