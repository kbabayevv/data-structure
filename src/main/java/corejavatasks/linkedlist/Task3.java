package corejavatasks.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Task3 {
    // Write a Java program to iterate through all elements
    // in a linked list starting at the specified position.
    public static void main(String[] args) {
        LinkedList<String> products = new LinkedList<>();
        products.add("Car");
        products.add("Phone");
        products.add("Tablet");
        products.add("Notebook");

        Iterator<String> iterator = products.listIterator(1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
