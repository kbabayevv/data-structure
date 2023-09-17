package corejavatasks.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println(colors);
        System.out.println("Array list after reversed");
        Collections.reverse(colors);
        System.out.println(colors);
    }
}
