package corejavatasks.treeset;

import java.util.TreeSet;

public class Task13 {
    //Write a Java program to get an element in a tree set
    // that has a lower value than the given element
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(22);
        treeSet.add(36);
        treeSet.add(25);
        treeSet.add(16);
        treeSet.add(70);
        treeSet.add(82);
        treeSet.add(89);
        treeSet.add(14);

        System.out.println("Strictly less than 69 : " + treeSet.lower(69));
        System.out.println("Strictly less than 12 : " + treeSet.lower(12));
    }
}
