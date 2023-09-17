package corejavatasks.treemap;

import java.util.TreeMap;

public class Task8 {
    //Write a Java program to get a key-value mapping
    // associated with the greatest key and the least key in a map
    public static void main(String[] args) {
        TreeMap<String, String> tree_map = new TreeMap<>();
        tree_map.put("C1", "Red");
        tree_map.put("C2", "Green");
        tree_map.put("C3", "Black");
        tree_map.put("C4", "White");

        System.out.println("Original TreeMap content: " + tree_map);
        System.out.println("Greatest key: " + tree_map.firstEntry());
        System.out.println("Least key: " + tree_map.lastEntry());
    }
}
