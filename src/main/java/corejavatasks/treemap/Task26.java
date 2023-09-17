package corejavatasks.treemap;

import java.util.TreeMap;

public class Task26 {
    //Write a Java program to get the least key greater than
    // or equal to the given key. Returns null if there is no such key
    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(40, "Black");
        tree_map.put(50, "White");
        tree_map.put(60, "Pink");

        System.out.println("Original TreeMap content: " + tree_map);
        System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingKey(20));
        System.out.println("Keys greater than or equal to 30: " + tree_map.ceilingKey(30));
        System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingKey(50));
    }
}
