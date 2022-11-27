package com.company;


public class Optimus extends Robot implements Start, Ak47 {

    public Optimus(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Optimus is started");
    }

    @Override
    public void shoot() {

    }

    @Override
    void transform() {

    }

    @Override
    public void temp() {

    }
}
