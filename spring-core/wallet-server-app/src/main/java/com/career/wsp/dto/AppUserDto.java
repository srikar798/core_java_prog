package com.career.wsp.dto;

import lombok.*;

import java.util.UUID;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
@Builder
public class AppUserDto {

    private UUID id;
    private  String username;
    private String password;
    private String email;
    private String mobile;

}
