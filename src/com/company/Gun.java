package com.company;

public interface Gun {
    String HELLO = "Hello";

    void shoot();

    static void tempMethod() {
        System.out.println(HELLO + " World!");
    }

    default String sayHello() {
        return "Hello";
    }
}
