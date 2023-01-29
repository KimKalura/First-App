package com.springapps.firstapp.beans.beanscopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ScopesRunner implements CommandLineRunner {
    private Count counter1;
    private Count counter2;

    public ScopesRunner(@Autowired Count counter1, @Autowired Count counter2) {
        this.counter1 = counter1;
        this.counter2 = counter2;
    }

    @Override
    public void run(String... args) throws Exception {
        counter1.increment();
        counter2.increment();
        System.out.println(counter1.getCounter());
        System.out.println(counter2.getCounter());
    }
}
