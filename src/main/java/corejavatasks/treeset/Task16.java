package corejavatasks.treeset;

import java.util.TreeSet;

public class Task16 {
    //Write a Java program to remove a given element from a tree set
    public static void main(String[] args) {
        TreeSet<String> name = new TreeSet<>();
        name.add("Kamran");
        name.add("Nurlan");
        name.add("Orxan");
        name.add("Serxan");
        name.add("Senan");
        System.out.println("Original Tree Set: " + name);

        name.remove("Orxan");
        System.out.println("After removing 'Orxan' :  " + name);

    }
}
