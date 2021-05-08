package com.demo.fizzbuzzdemo;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

    public String evaluateNumber(int num) {
        if(isNumberDivisibleBy3(num)){
            return "Fizz";
        }
        return String.valueOf(num);
    }

    private boolean isNumberDivisibleBy3(int num) {
        return num % 3 == 0;
    }
}