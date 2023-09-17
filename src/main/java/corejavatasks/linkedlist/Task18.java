package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task18 {
    // Write a Java program to remove and
    // return the first element of a linked list.
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList <String> ();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        System.out.println("Original linked  list: " + colors);

        System.out.println("Removed element: "+colors.pop());

        System.out.println("Linked list after pop operation: "+ colors);
    }
}
