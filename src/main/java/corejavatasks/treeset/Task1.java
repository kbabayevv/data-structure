package corejavatasks.treeset;

import java.util.TreeSet;

public class Task1 {
    //Write a Java program to create a tree set,
    // add some colors (strings) and print out the tree set.
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Green");
        colors.add("Gray");


        System.out.println(colors);
    }
}
