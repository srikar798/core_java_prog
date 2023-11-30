package com.career.iplstats.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleCountDto {
    private String roleName;
    private long count;
}
