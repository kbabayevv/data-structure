package corejavatasks.linkedlist;

import java.time.DayOfWeek;
import java.util.LinkedList;

public class Task12 {
    // Write a Java program to remove the first and last
    // elements from a linked list.
    public static void main(String[] args) {
        LinkedList<Integer> temp = new LinkedList<>();
        temp.add(15);
        temp.add(17);
        temp.add(18);
        temp.add(13);
        temp.add(20);
        temp.add(21);
        temp.add(19);
        for (int i = 0; i < temp.size(); i++) {
            System.out.println("Temperature at " + DayOfWeek.of((i + 1)) + " is " + temp.get(i) + " °C");
        }
        temp.removeFirst();
        temp.removeLast();
        System.out.println("Removing first and last temperature from weekly report");
        for (int i = 0; i < temp.size(); i++) {
            System.out.println("Temperature at " + DayOfWeek.of((i + 2)) + " is " + temp.get(i) + " °C");
        }

    }
}
