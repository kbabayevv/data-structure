package corejavatasks.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        System.out.println(colors);//1st way

        colors.forEach(color -> System.out.println(color));//2nd way

        for (String color : colors) {
            System.out.println(color);//for-enhancement-->3rd way
        }

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));//traditional for-->4th way
        }

        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());//5th way
        }
    }
}
