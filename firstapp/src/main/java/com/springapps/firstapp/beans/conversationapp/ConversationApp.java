package com.springapps.firstapp.beans.conversationapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversationApp implements CommandLineRunner {
    @Autowired
    Conversation conversation;

    @Override
    public void run(String... args) {
        conversation.start();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConversationApp.class, args);
    }
}
