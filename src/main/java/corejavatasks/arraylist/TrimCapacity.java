package corejavatasks.arraylist;

import java.util.ArrayList;

public class TrimCapacity {
    public static void main(String[] args) {
        // Create an ArrayList with an initial capacity of 10
        ArrayList<String> arrayList = new ArrayList<>(10);

        // Add some elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Fig");

        // Trim the capacity of the ArrayList
        arrayList.trimToSize();

        // Print the elements of the trimmed ArrayList
        System.out.println("Trimmed ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}
