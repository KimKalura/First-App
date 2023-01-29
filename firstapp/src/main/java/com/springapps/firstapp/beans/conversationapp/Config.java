package com.springapps.firstapp.beans.conversationapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Person person1() {
        return new Person("John");
    }

    @Bean
    public Person person2() {
        return new Person("Mary");
    }

    @Bean
    public Conversation conversation(@Qualifier("person1") Person p1, @Qualifier("person2") Person p2) {
        return new Conversation(p1, p2);
    }
}
