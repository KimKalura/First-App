package com.springapps.firstapp.passwordgenerator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";

    @Bean
    public PasswordAlphabet allCharacters() {
        return new PasswordAlphabet(CHARACTERS + NUMBERS);
    }

    @Bean
    public PasswordAlphabet numberCharacters() {
        return new PasswordAlphabet(NUMBERS);
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
