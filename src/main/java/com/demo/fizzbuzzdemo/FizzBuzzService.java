package com.demo.fizzbuzzdemo;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

    /*
        Print FizzBuzz if number divisible by 3 & 5
        Print Fizz if number divisible by 3
        Print Buzz if number divisible by 5
        Print number if none of the condition satisfied
     */
    public void printFizzBuzz() {
        for (int num = 1; num <= 100; num++) {
            System.out.println(evaluateNumber(num));
        }
    }

    public String evaluateNumber(int num) {
        if (isNumberDivisibleBy3And5(num)) {
            return "FizzBuzz";
        }
        if (isNumberDivisibleBy3(num)) {
            return "Fizz";
        }
        if (isNumberDivisibleBy5(num)) {
            return "Buzz";
        }
        return String.valueOf(num);
    }

    private boolean isNumberDivisibleBy3(int num) {
        return num % 3 == 0;
    }

    private boolean isNumberDivisibleBy5(int num) {
        return num % 5 == 0;
    }

    private boolean isNumberDivisibleBy3And5(int num) {
        return num % 3 == 0 && num % 5 == 0;
    }
}