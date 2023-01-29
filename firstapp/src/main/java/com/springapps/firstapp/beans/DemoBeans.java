package com.springapps.firstapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoBeans implements CommandLineRunner {
    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
        System.out.println(applicationContext.getBean("customer"));
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoBeans.class, args);
    }

    @Bean
    public Customer customer(@Qualifier("address2") String address) {
        return new Customer("John", address);
    }

    @Bean
    public Customer temporary(Customer customer) {
        System.out.println(customer);
        return customer;
    }
}
