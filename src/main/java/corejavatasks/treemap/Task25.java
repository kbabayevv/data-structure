package corejavatasks.treemap;

import java.util.TreeMap;

public class Task25 {
    //Write a Java program to get a key-value mapping associated
    // with the least key greater than or equal to the given key.
    // Return null if there is no such key
    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(30, "Black");
        tree_map.put(40, "White");
        tree_map.put(50, "Pink");

        System.out.println("Original TreeMap content: " + tree_map);
        System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingEntry(20));
        System.out.println("Keys greater than or equal to 40: " + tree_map.ceilingEntry(40));
        System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingEntry(50));
    }
}
