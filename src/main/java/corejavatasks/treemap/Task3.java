package corejavatasks.treemap;

import java.util.TreeMap;

public class Task3 {
    //Write a Java program to search for a key in a Tree Map
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Car");
        treeMap.put(2, "Phone");
        treeMap.put(3, "Tablet");
        treeMap.put(4, "Notebook");
        treeMap.put(5, "Smart watch");

        System.out.println("Original Tree Map: " + treeMap);
        System.out.println("Tree Map contain 1 key? " + treeMap.containsKey(1));
        System.out.println("Tree Map contain 6 key? " + treeMap.containsKey(6));
    }
}
