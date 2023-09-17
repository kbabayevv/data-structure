package corejavatasks.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Task2 {
    //Write a Java program to iterate
    //through all elements in a tree set
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Green");
        colors.add("Gray");

        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
