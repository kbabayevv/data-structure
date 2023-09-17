package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task7 {
    //Write a Java program to insert the
    // specified element at the front and end of a linked list.
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");

        System.out.println("Original linked list: " + colors);

        colors.offerFirst("Pink");
        colors.offerLast("Blue");
        System.out.println("Final linked list: " + colors);
    }
}
