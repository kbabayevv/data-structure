package corejavatasks.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task1 {
    //Write a Java program to
    // associate the specified value with the specified key in a Tree Map
    public static void main(String[] args) {
        // Create a tree map
        TreeMap<Integer, String> tree_map = new TreeMap<>();
        // Put elements to the map
        tree_map.put(1, "Red");
        tree_map.put(2, "Green");
        tree_map.put(3, "Black");
        tree_map.put(4, "White");
        tree_map.put(5, "Blue");

        for (Entry<Integer, String> entry : tree_map.entrySet()) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}
