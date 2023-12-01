package com.career.iplstats.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleAmountDto {
    private String roleName;
    private BigDecimal totalAmount;
}
