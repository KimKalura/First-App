package com.springapps.firstapp.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Addresses {

    @Bean
    public String address1() {
        return "str. Republicii, 102";
    }

    @Bean
    public String address2() {
        return "str. Primaverii, 103";
    }
}
