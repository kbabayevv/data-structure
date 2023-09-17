package corejavatasks.treeset;

import java.util.TreeSet;

public class Task9 {
    // Write a Java program to
    // find numbers less than 7 in a tree set.
    public static void main(String[] args) {
        TreeSet<Integer> counts1 = new TreeSet<>();
        TreeSet<Integer> counts2 = new TreeSet<>();
        counts1.add(0);
        counts1.add(1);
        counts1.add(2);
        counts1.add(3);
        counts1.add(4);
        counts1.add(5);
        counts1.add(6);
        counts1.add(7);
        counts1.add(8);

        counts2 = (TreeSet<Integer>) counts1.headSet(7);// Find numbers less than 7
        System.out.println("Tree set data: " + counts2);
    }
}
