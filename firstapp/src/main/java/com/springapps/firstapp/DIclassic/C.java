package com.springapps.firstapp.DIclassic;

public class C {
    private B b;

    public C(B b) {
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
