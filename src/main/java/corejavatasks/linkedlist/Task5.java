package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task5 {
    //Write a Java program to insert the specified element
    // at the specified position in the linked list
    public static void main(String[] args) {
        LinkedList<Integer> count = new LinkedList<>();
        count.add(0);
        count.add(1);
        count.add(3);
        count.add(5);
        count.add(7);
        count.add(9);
        System.out.println(count);
        count.add(2,2);
        count.add(4,4);
        count.add(6,6);
        count.add(8,8);
        count.add(10,10);
        System.out.println(count);
    }
}
