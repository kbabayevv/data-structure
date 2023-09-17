package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task22 {
    //Write a Java program to compare two linked lists.
    public static void main(String[] args) {
        LinkedList<String> colors1 = new LinkedList<>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Black");
        colors1.add("White");
        colors1.add("Pink");

        LinkedList<String> colors2 = new LinkedList<>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Black");
        colors2.add("Orange");

        //comparison output in linked list
        LinkedList<String> comparison = new LinkedList<>();
        for (String e : colors1)
            comparison.add(colors2.contains(e) ? "Yes" : "No");
        System.out.println(comparison);
    }
}
