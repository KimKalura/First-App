package com.springapps.firstapp.DIwithbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    private A a;

    public B(@Autowired A a) {
        this.a = a;
    }

    public int generateNumber() {
        return 1 + a.generateNumber();
    }
}
