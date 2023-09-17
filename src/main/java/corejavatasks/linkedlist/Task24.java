package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task24 {
    //Write a Java program to replace
    // an element in a linked list.
    public static void main(String[] args) {
        LinkedList<String> person = new LinkedList<>();
        person.add("Kamran Babayev");
        person.add("Orxan Rehimov");
        person.add("Nurlan Babayev");
        person.add("Mikayil Axundov");
        person.add("Terlan Mirzeyev");
        System.out.println("Original linked list: " + person);
        person.set(1, "Serxan Rehiomov");
        System.out.println("After replacing element at index 1");
        System.out.println("Updated linked list: " + person);
    }
}
