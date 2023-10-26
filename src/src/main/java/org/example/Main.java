package org.example;

import org.example.composition.Table;
import org.example.inheritance.Cat;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        inheritance();
        composition();
    }

    public static void inheritance() {
        Cat myCat = new Cat("Gypsy");
        System.out.println(myCat.getName());
    }

    public static void composition() {
        Table myTable = new Table(4);
    }


}