package com.springapps.firstapp.DIclassic;

public class B {
    private A a;

    public B(A a) {
        this.a = a;
    }

    public int generateNumber() {
        return 1 + a.generateNumber();
    }
}
