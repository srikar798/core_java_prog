package com.career.iplstats.exception;

public class TeamNotFoundException extends RuntimeException{

    public TeamNotFoundException(String message){
        super(message);
    }
}
