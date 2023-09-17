package corejavatasks.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortionOfArrayList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        System.out.println("Original list: " + colors);
        List<String> sub_List = colors.subList(0, 3);//it will create new ArrayList at backend
        System.out.println("List of first three elements: " + sub_List);
        //Here we see different hashcode()
        System.out.println(colors.hashCode());//-1671428463
        System.out.println(sub_List.hashCode());//294939739
    }
}
