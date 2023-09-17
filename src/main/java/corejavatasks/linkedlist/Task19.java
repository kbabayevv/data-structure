package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task19 {
    //Write a Java program to retrieve, but not remove,
    // the first and last element of a linked list
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        System.out.println("Original linked list: " + colors);

        String first = colors.peekFirst();
        String last = colors.peekLast();
        System.out.println("First element in the list: " + first);
        System.out.println("Last element in the list: " + last);
        System.out.println("Original linked list: " + colors);
    }
}
