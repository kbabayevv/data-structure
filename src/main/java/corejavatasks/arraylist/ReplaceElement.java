package corejavatasks.arraylist;

import java.util.ArrayList;

public class ReplaceElement {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Kamran");
        name.add("Nurlan");
        System.out.println("Original names " + name);
        String newName = "Cavidan";
        name.set(1, newName);
        System.out.println("After replace 2nd element with new one");
        System.out.println(name);
    }
}
