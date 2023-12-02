package com.career.iplstats.dto;

import org.springframework.http.HttpStatus;

public record ErrorResponseDto(String message, HttpStatus httpStatus){}