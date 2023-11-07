package com.meta.cj.day30;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private long id;
    private String name;
    private LocalDate doj;
    private LocalDate dob;
}
