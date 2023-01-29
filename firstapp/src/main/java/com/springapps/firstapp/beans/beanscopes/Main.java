package com.springapps.firstapp.beans.beanscopes;

public class Main {
    public static void main(String[] args) {
        Count counter1 = Count.getInstance();
        Count counter2 = Count.getInstance();
        counter1.increment();
        counter2.increment();
        System.out.println(counter1.getCounter());
        System.out.println(counter2.getCounter());
    }
}
