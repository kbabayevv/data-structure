package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task10 {
    //Write a Java program to display elements
    // and their positions in a linked list.
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Monkey");
        animals.add("Rabbit");
        animals.add("Camel");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Element at index " + i + ": " + animals.get(i));
        }
    }
}
