package org.example.polymorphism;

public class Dog extends Animal {

    public Dog(String name) {
        this.legs = 4;
        this.name = name;
    }

    public void speak() {
        System.out.println("Woof");
    }
}
