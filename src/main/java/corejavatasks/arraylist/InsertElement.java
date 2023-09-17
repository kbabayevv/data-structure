package corejavatasks.arraylist;

import java.util.ArrayList;

public class InsertElement {
    public static void main(String[] args) {
        ArrayList<Integer> age = new ArrayList<>();
        age.add(1);
        age.add(2);
        age.add(3);
        age.add(4);
        age.add(5);
        age.add(0, 6);//to insert an element into the array list at the first position
        System.out.println(age);
    }
}
