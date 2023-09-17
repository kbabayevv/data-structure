package corejavatasks.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task21 {
    //Write a Java program to convert a linked list to an array list.
    public static void main(String[] args) {
        LinkedList<String> products = new LinkedList<>();
        products.add("Car");
        products.add("Book");
        products.add("Phone");
        products.add("Notebook");
        System.out.println("Linked  List: " + products);

        List<String> list = new ArrayList<>(products);
        System.out.println("Array List: " + list);
    }

}
