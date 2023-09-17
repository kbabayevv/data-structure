package corejavatasks.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayListElements {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Monkey");
        animals.add("Rabbit");

        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
