package com.springapps.firstapp.DIwithbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {
    private B b;

    public C(@Autowired B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public int generateNumber() {
        return 2 + b.generateNumber();
    }

}
