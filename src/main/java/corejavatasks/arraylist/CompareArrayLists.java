package corejavatasks.arraylist;

import java.util.ArrayList;

public class CompareArrayLists {
    public static void main(String[] args) {
        ArrayList<String> color1 = new ArrayList<>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("White");
        color1.add("Pink");


        ArrayList<String> color2 = new ArrayList<>();
        color2.add("Red");
        color2.add("Green");
        color2.add("Black");
        color2.add("Pink");

        //Storing the comparison output in ArrayList<String>
        ArrayList<String> comparison = new ArrayList<>();
        for (String e : color1)
            comparison.add(color2.contains(e) ? "Yes" : "No");
        System.out.println(comparison);


    }
}
