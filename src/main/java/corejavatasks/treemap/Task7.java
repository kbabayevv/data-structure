package corejavatasks.treemap;

import java.util.*;
import java.util.Map.Entry;

public class Task7 {
    //Write a Java program to sort keys in a Tree Map by using a comparator
    public static void main(String args[]) {
        TreeMap<String, String> tree_map1 = new TreeMap<>(new SortKey());
        tree_map1.put("C2", "Red");
        tree_map1.put("C4", "Green");
        tree_map1.put("C3", "Black");
        tree_map1.put("C1", "White");

        System.out.println(tree_map1);
    }

    static class SortKey implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            return str1.compareTo(str2);
        }
    }
}


