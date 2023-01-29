package com.springapps.firstapp.DIwithbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DIDemo implements CommandLineRunner {
    @Autowired
    private C c;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(c.generateNumber());
    }

    public static void main(String[] args) {
        SpringApplication.run(DIDemo.class, args);
    }
}
