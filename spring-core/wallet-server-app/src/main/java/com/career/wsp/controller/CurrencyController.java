package com.career.wsp.controller;

import com.career.wsp.record.Currency;
import com.career.wsp.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/currency")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("supported-currencies")
    public ResponseEntity<List<Currency>> supportedCurrencies(){

        return ResponseEntity.ok(currencyService.supportedCurrencies());
    }
}
