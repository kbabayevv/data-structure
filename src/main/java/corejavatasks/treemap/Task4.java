package corejavatasks.treemap;

import java.util.TreeMap;

public class Task4 {
    //Write a Java program to search for a value in a Tree Map
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Car");
        treeMap.put(2, "Phone");
        treeMap.put(3, "Tablet");
        treeMap.put(4, "Notebook");
        treeMap.put(5, "Smart watch");

        System.out.println("Original Tree Map: " + treeMap);
        System.out.println("Tree Map contain 'Car' value? " + treeMap.containsValue("Car"));
        System.out.println("Tree Map contain 'TV' value? " + treeMap.containsValue("TV"));
    }
}
