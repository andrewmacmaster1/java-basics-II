package org.example.abstraction;

public class Car extends Vehicle {

    String model;
    public Car(String model) {
        this.axles = 2;
        this.wheels = 4;
        this.model = model;
    }
}
