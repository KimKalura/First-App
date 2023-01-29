package com.springapps.firstapp.beanlifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class TechLibrary {
    private List<String> bookTitles = new ArrayList<>();

    @PostConstruct
    public void init() {
        bookTitles.add("Clean code");
        bookTitles.add("Algorithms");
        System.out.println("init " + bookTitles);
    }

    @PreDestroy
    public void destroy() {
        bookTitles.clear();
        System.out.println("destroy " + bookTitles);
    }
}
