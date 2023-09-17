package corejavatasks.treemap;

import java.util.TreeMap;

public class Task18 {
    //Write a Java program to get a NavigableSet view of keys in a map
    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map1 = new TreeMap<>();
        tree_map1.put(10, "Red");
        tree_map1.put(20, "Green");
        tree_map1.put(40, "Black");
        tree_map1.put(50, "White");
        tree_map1.put(60, "Pink");

        System.out.println("Original TreeMap content: " + tree_map1);
        System.out.println("Original TreeMap content: " + tree_map1.navigableKeySet());
    }
}
