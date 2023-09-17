package corejavatasks.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Task17 {
    //Write a Java program to copy a linked list to another linked list.
    public static void main(String[] args) {
        LinkedList<String> name1 = new LinkedList<>();
        name1.add("Kamran");
        name1.add("Orxan");
        System.out.println("Name 1 linked list: " + name1);
        LinkedList<String> name2 = new LinkedList<>();
        name2.add("Nurlan");
        name2.add("Serxan");
        System.out.println("Name 2 linked list: " + name2);

        Collections.copy(name2, name1);
        System.out.println("Copy name1 to name2");
        System.out.println("Name 1 linked list: " + name1);
        System.out.println("Name 2 linked list: " + name2);
    }
}
