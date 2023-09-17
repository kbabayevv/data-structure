package corejavatasks.treemap;

import java.util.TreeMap;

public class Task16 {
    //Write a Java program to get a key-value mapping
    // associated with the greatest key strictly less than
    // the given key. Return null if there is no such key
    public static void main(String[] args) {
        TreeMap< Integer, String > tree_map = new TreeMap< Integer, String >();
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(40, "Black");
        tree_map.put(50, "White");
        tree_map.put(60, "Pink");

        System.out.println("Original TreeMap content: "+ tree_map);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): "+ tree_map.lowerEntry(10));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): "+ tree_map.lowerEntry(20));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): "+ tree_map.lowerEntry(70));
    }
}
