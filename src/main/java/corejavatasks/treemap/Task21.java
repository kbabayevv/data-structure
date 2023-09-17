package corejavatasks.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Task21 {
    //Write a Java program to get the portion of a map whose keys range from a
    // given key (inclusive) to another key (exclusive)
    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();
        SortedMap<Integer, String> sub_tree_map;

        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(30, "Black");
        tree_map.put(40, "White");
        tree_map.put(50, "Pink");
        System.out.println("Original TreeMap content: " + tree_map);
        sub_tree_map = tree_map.subMap(20, 40);
        System.out.println("Sub map key-values: " + sub_tree_map);
    }
}
