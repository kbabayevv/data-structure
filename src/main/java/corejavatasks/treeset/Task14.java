package corejavatasks.treeset;

import java.util.TreeSet;

public class Task14 {
    //Write a Java program to retrieve and remove the first element of a tree set
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
        
        System.out.println("Original tree set: " + treeSet);
        System.out.println("Removes the first(lowest) element: " + treeSet.pollFirst());
        System.out.println("Tree set after removing first element: " + treeSet);
    }
}
