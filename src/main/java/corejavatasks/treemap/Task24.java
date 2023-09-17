package corejavatasks.treemap;

import java.util.TreeMap;

public class Task24 {
    //Write a Java program to get a portion
    // of a map whose keys are greater than a given key
    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(30, "Black");
        tree_map.put(40, "White");
        tree_map.put(50, "Pink");

        System.out.println("Original TreeMap content: " + tree_map);
        System.out.println("Keys are greater than 20: " + tree_map.tailMap(20, false));
    }
}
