package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task2 {
    // Write a Java program to iterate through all elements in a linked list
    public static void main(String[] args) {
        LinkedList<Integer> ages = new LinkedList<>();
        ages.add(24);
        ages.add(25);
        ages.add(26);
        ages.add(49);
        ages.add(53);

        for (Integer age : ages) {
            System.out.println(age);
        }
    }
}
