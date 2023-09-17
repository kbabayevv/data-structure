package corejavatasks.arraylist;

import java.util.ArrayList;

public class TestEmptyOrNot {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Kamran");
        name.add("Cavidan");
        name.add("Nurlan");

        boolean test1 = name.isEmpty();
        System.out.println(test1);

        name.clear();
        boolean test2 = name.isEmpty();
        System.out.println(test2);
    }
}
