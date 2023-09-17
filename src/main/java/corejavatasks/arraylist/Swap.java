package corejavatasks.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        products.add("Car");
        products.add("Phone");
        products.add("Notebook");
        products.add("Book");
        products.add("Tablet");

        System.out.println(products);
        Collections.swap(products, 0, 2);
        System.out.println("After swap elements at index 0 and 2");
        System.out.println(products);
    }
}
