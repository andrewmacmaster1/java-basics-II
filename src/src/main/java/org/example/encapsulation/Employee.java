package org.example.encapsulation;

public class Employee extends Person {
    private int salary;

    Employee(String firstName, String lastName, Byte age, Integer ssn, Integer Salary) {
        super(firstName, lastName, age, ssn);
        this.salary = Salary;
    }

    public void speak() {
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName() + "\nSalary: " + this.salary);
    }
}
