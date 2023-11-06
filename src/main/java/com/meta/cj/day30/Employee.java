package com.meta.cj.day30;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Employee {
    private long id;
    private String name;
    private LocalDate dob;
    private LocalDate doj;
}
