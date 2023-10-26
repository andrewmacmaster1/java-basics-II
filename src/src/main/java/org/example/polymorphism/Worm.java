package org.example.polymorphism;

public class Worm extends Animal {

    public Worm(String name) {
        this.legs = 0;
        this.name = name;
    }

    public void speak() {
        System.out.println("...");
    }
}
