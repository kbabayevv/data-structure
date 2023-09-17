package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task9 {
    //Write a Java program to get the first and last
    // occurrence of the specified elements in a linked list.
    public static void main(String[] args) {
        LinkedList<String> carModels = new LinkedList<>();
        carModels.add("Mercedes-Benz");
        carModels.add("BMW");
        carModels.add("KIA");
        carModels.add("Hyundai");
        carModels.add("Ford");
        System.out.println("Original linked list: " + carModels);
        System.out.println("First element: " + carModels.getFirst());
        System.out.println("Last element: " + carModels.getLast());

    }
}
