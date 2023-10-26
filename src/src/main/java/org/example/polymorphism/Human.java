package org.example.polymorphism;

public class Human extends Animal {

    public Human(String name) {
        this.legs = 2;
        this.name = name;
    }

    public void speak() {
        System.out.println("Hello");
    }
}
