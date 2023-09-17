package corejavatasks.treemap;

import java.util.TreeMap;

public class Task14 {
    //Write a Java program to get the portion of this map whose keys are less
    // than (or equal to, if inclusive is true) a given key
    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(40, "Black");
        tree_map.put(50, "White");
        tree_map.put(60, "Pink");

        System.out.println("Original TreeMap content: " + tree_map);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + tree_map.headMap(10, true));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + tree_map.headMap(20, true));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + tree_map.headMap(70, true));
    }
}
