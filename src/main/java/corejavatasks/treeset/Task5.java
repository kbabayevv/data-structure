package corejavatasks.treeset;

import java.util.TreeSet;

public class Task5 {
    //Write a Java program to get
    // the first and last elements in a tree set
    public static void main(String[] args) {
        TreeSet<Integer> count = new TreeSet<>();
        count.add(0);
        count.add(1);
        count.add(2);
        count.add(3);
        count.add(4);

        Integer first = count.first();
        Integer last = count.last();
        System.out.println("First element: " + first + " \nLast element: " + last);
    }
}
