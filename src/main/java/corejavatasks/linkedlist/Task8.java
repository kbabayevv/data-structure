package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task8 {
    //Write a Java program to insert some elements
    // at the specified position into a linked list.
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("Kamran");
        name.add("Nurlan");
        System.out.println("Names: " + name);

        LinkedList<String> surname = new LinkedList<>();
        surname.add("Babayev");
        surname.add("Rzayev");
        System.out.println("Surnames: " + surname);

        name.addAll(2, surname);
        System.out.println("Final result: " + name);


    }
}
