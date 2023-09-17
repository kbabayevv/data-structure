package corejavatasks.arraylist;

import java.util.ArrayList;

public class ClearArrayList {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        products.add("Car");
        products.add("Phone");
        products.add("Notebook");
        products.add("Book");
        products.add("Watch");
        System.out.println(products);
        System.out.println("After cleaning");
        products.removeAll(products);//or products.clear();
        System.out.println(products);
    }
}
