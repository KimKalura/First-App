package com.springapps.firstapp.beans.beanscopes;

public class Count {
    private Integer counter;
    private static Count instance;


    private Count(){};

    public static Count getInstance() {
        if (instance == null) {
            instance = new Count(0);
        }
        return instance;
    }

    public Count(Integer counter) {
        this.counter = counter;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }


    public void increment() {
        counter++;
    }
}
