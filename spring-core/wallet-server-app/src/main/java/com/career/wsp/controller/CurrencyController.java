package com.career.wsp.controller;

import com.career.wsp.record.Currency;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/currency")
public class CurrencyController {

    @GetMapping("supporrted-currencies")
    public ResponseEntity<Currency> supportedCurrencies(){
        return null;
    }
}
