package com.company;

public abstract class Robot{
    String name;

    public Robot(String name) {
        this.name = name;
    }

    abstract void transform();
}
