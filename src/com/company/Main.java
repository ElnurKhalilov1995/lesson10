package com.company;

public class Main {

    public static void main(String[] args) {
        Optimus optimus = new Optimus("Prime");

        System.out.println(optimus.sayHello());

        Robot robot = optimus;
        Gun gun = optimus;
        Start start = optimus;

        Gun.tempMethod();
    }


}
