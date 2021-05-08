package com.demo.fizzbuzzdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class FizzbuzzdemoApplication {

    @Autowired
    FizzBuzzService fizzBuzzService;

    public static void main(String[] args) {
        SpringApplication.run(FizzbuzzdemoApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        fizzBuzzService.printFizzBuzz();
    }
}
