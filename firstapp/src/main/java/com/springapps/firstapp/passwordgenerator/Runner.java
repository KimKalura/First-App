package com.springapps.firstapp.passwordgenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private final PasswordGenerator passwordGenerator;

    public Runner(@Autowired PasswordGenerator passwordGenerator) {
        this.passwordGenerator = passwordGenerator;
    }

    @Override
    public void run(String... args) {
        String generatedPassword1 = passwordGenerator.generatePassword(5);
        String generatedPassword2 = passwordGenerator.generatePassword(10);
        System.out.println(generatedPassword1);
        System.out.println(generatedPassword2);
        System.out.println(passwordGenerator.encode(generatedPassword1));
    }
}
