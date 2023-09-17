package corejavatasks.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Task4 {
    //Write a Java program to iterate a linked list in reverse order.
    public static void main(String[] args) {
        LinkedList<Double> salary = new LinkedList<>();
        salary.add(938.5);
        salary.add(1238.5);
        salary.add(1338.5);
        salary.add(1458.5);
        salary.add(1500.0);
        System.out.println(salary);
        Collections.reverse(salary);
        System.out.println("After reverse Linked List");
        System.out.println(salary);
    }
}
