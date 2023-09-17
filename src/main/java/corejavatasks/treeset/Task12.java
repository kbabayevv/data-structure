package corejavatasks.treeset;

import java.util.TreeSet;

public class Task12 {
    //Write a Java program to get the element in a tree
    // set strictly greater than or equal to the given element
    public static void main(String[] args) {
        TreeSet<Integer> elements = new TreeSet<>();
        elements.add(10);
        elements.add(21);
        elements.add(32);
        elements.add(43);
        elements.add(54);
        elements.add(65);
        elements.add(76);
        elements.add(87);

        System.out.println("Strictly greater than or equal to 86 : " + elements.higher(86));
        System.out.println("Strictly greater or equal to 29 : " + elements.higher(29));
    }
}
