package corejavatasks.treemap;

import java.util.Set;
import java.util.TreeMap;

public class Task5 {
    //Write a Java program to get all keys from a Tree Map
    public static void main(String[] args) {
        TreeMap<String, String> tree_map1 = new TreeMap<>();
        tree_map1.put("C1", "Red");
        tree_map1.put("C2", "Green");
        tree_map1.put("C3", "Black");
        tree_map1.put("C4", "White");

        Set<String> keys = tree_map1.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
