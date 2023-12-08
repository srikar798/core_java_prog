package com.career.saop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class MathService {


    public List<Integer> generatePrimeNumbers(int lb, int ub) {
        List<Integer> list = new ArrayList<>();
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean isPrime(int num) {
        if (num != 2 && num % 2 == 0 || num < 2) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}