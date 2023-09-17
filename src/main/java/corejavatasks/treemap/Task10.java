package corejavatasks.treemap;

import java.util.TreeMap;

public class Task10 {
    //Write a Java program to get a reverse order view of
    // the keys contained in a given map
    public static void main(String[] args) {
        TreeMap<String, String> tree_map = new TreeMap<>();
        tree_map.put("C2", "Red");
        tree_map.put("C1", "Green");
        tree_map.put("C4", "Black");
        tree_map.put("C3", "White");

        System.out.println("Original TreeMap content: " + tree_map);
        System.out.println("Reverse order view of the keys: " + tree_map.descendingKeySet());
    }
}
