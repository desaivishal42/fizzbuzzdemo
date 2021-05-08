package com.demo.fizzbuzzdemo;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

    public String evaluateNumber(int num) {
        return String.valueOf(num);
    }
}
