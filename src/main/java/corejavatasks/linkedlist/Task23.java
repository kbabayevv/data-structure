package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task23 {
    //Write a Java program to check if
    // a linked list is empty or not
    public static void main(String[] args) {
        LinkedList<String> phoneNumber = new LinkedList<>();
        phoneNumber.add("+56256464646464");
        phoneNumber.add("+46546134564454");
        phoneNumber.add("+74125896358946");
        phoneNumber.add("+74125459632546");

        System.out.println("Original linked list: " + phoneNumber);
        System.out.println("Check the above linked list is empty or not! " + phoneNumber.isEmpty());
        phoneNumber.removeAll(phoneNumber);
        System.out.println("Linked list after remove all elements " + phoneNumber);
        System.out.println("Check the above linked list is empty or not! " + phoneNumber.isEmpty());

    }
}
