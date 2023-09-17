package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task11 {
    // Write a Java program to remove
    // a specified element from a linked list.
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("Kamran");
        name.add("Orxan");
        name.add("Nurlan");
        name.add("Serxan");
        name.add("Elxan");

        System.out.println("Original linked list: " + name);

        name.remove(4);
        System.out.println("The New linked list: " + name);
    }
}
