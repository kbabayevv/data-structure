package corejavatasks.treemap;

import java.util.TreeMap;

public class Task6 {
    //Write a Java program to delete all elements from a Tree Map
    public static void main(String[] args) {
        TreeMap<String,String> tree_map1 = new TreeMap<>();
        tree_map1.put("C1", "Red");
        tree_map1.put("C2", "Green");
        tree_map1.put("C3", "Black");
        tree_map1.put("C4", "White");

        System.out.println("Original TreeMap content: "+tree_map1);
        tree_map1.clear();
        System.out.println("The New map: "+tree_map1);
    }
}
