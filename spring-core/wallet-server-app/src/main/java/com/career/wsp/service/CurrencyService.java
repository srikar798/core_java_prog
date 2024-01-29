package com.career.wsp.service;

import com.career.wsp.record.Currency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Slf4j
@Service
public class CurrencyService {

    List<String> supportedCurrencyList = List.of("USD","INR","CNY");

    public List<Currency> supportedCurrencies()
    {
        RestClient restClient =  RestClient.create();
        List<Currency> currencyList = restClient.get().uri("https://currency-server-app-92tj.onrender.com/api/currency/all")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Currency>>(){});
        if(currencyList == null){
            throw new RuntimeException("Unable to get the currencies");
        }
        List<Currency> filteredList = currencyList.stream().filter(currency -> {
             return supportedCurrencyList.contains(currency.code());
        }).toList();
        log.info("Supported currencies are . {}", filteredList);
        return filteredList;
    }
}
