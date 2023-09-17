package corejavatasks.treeset;

import java.util.TreeSet;

public class Task6 {
    // Write a Java program to clone a
    // tree set list to another tree set
    public static void main(String[] args) {
        TreeSet<String> name = new TreeSet<>();
        name.add("Kamran");
        name.add("Nurlan");
        name.add("Orxan");
        name.add("Terlan");
        System.out.println("Original Tree Set: " + name);

        TreeSet<String> cloned = (TreeSet<String>) name.clone();
        System.out.println("Cloned Tree Set: " + cloned);
    }
}
