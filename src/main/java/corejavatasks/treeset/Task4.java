package corejavatasks.treeset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
    //Write a Java program to create a reverse order
    // view of the elements contained in a given tree set
    public static void main(String[] args) {
        TreeSet<String> products = new TreeSet<>();
        products.add("Car");
        products.add("Phone");
        products.add("Notebook");
        products.add("Smart watch");
        System.out.println("Original Tree set: " + products);

        Set<String> reversed = new LinkedHashSet<>();
        Iterator<String> it = products.descendingIterator();
        while (it.hasNext()) {
            String element = it.next();
            reversed.add(element);
        }
        System.out.println("Reversed Set: " + reversed);
    }
}
