package corejavatasks.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Task14 {
    //Write a Java program that
    // swaps two elements in a linked list.
    public static void main(String[] args) {
        LinkedList<Integer> count = new LinkedList<>();
        count.add(2);
        count.add(1);
        count.add(0);
        count.add(3);
        count.add(4);
        count.add(5);
        count.add(6);
        count.add(7);
        count.add(8);
        count.add(9);
        count.add(10);
        System.out.println(count);
        System.out.println("After swap elements in correct order");
        Collections.swap(count,0,2);
        System.out.println(count);
    }
}
