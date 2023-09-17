package corejavatasks.arraylist;

import java.util.ArrayList;

public class SpecifiedIndex {
    public static void main(String[] args) {
        ArrayList<String> product = new ArrayList<>();
        product.add("Car");
        product.add("Phone");
        product.add("Notebook");
        product.add("Book");
        product.add("Smart watch");

        System.out.println(product.get(4));//retrieve an element (at a specified index)
    }
}
