package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task6 {
    //Write a Java program to insert elements
    // into the linked list at the first and last positions.
    public static void main(String[] args) {
        LinkedList<Integer> ages = new LinkedList<>();
        ages.add(25);
        ages.add(26);
        ages.add(49);
        System.out.println(ages);
        ages.addFirst(24);
        ages.addLast(53);
        System.out.println(ages);
    }
}
