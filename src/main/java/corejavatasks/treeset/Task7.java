package corejavatasks.treeset;

import java.util.TreeSet;

public class Task7 {
    //Write a Java program to get
    // the number of elements in a tree set
    public static void main(String[] args) {
        TreeSet<String> name = new TreeSet<>();
        name.add("Kamran");
        name.add("Nurlan");
        name.add("Terlan");
        name.add("Orxan");
        name.add("Serxan");
        name.add("Senan");
        System.out.println("Original Tree Set: " + name);
        System.out.println("Number of elements = " + name.size());
    }
}
