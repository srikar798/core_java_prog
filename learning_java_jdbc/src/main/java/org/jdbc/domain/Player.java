package org.jdbc.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Player {


    private String name;
    private String role;
    private String team;
    private double amount;


}
