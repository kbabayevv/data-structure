package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task20 {
    //Write a Java program to check if a
    // particular element exists in a linked list
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("Kamran");
        name.add("Nurlan");
        name.add("Orxan");
        name.add("Serxan");
        System.out.println(name);

        boolean test1 = name.contains("Kamran");
        System.out.println("Does list contain 'Kamran'? : " + test1);

        name.clear();
        System.out.println("After cleaning list");
        System.out.println(name);

        boolean test2 = name.contains("Kamran");
        System.out.println("Does list contain 'Kamran'? : " + test1);
    }
}
