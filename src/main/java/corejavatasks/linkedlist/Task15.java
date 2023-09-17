package corejavatasks.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Task15 {
    //Write a Java program to shuffle
    // elements in a linked list.
    public static void main(String[] args) {
        LinkedList<Integer> count = new LinkedList<>();
        count.add(0);
        count.add(1);
        count.add(2);
        count.add(3);
        count.add(4);
        count.add(5);
        System.out.println("Original linked list: " + count);
        Collections.shuffle(count);
        System.out.println("After shuffling: " + count);
    }
}
