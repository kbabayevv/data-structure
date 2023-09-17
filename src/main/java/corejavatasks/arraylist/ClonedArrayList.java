package corejavatasks.arraylist;

import java.util.ArrayList;

public class ClonedArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kamran");
        names.add("Orxan");
        names.add("Telman");
        names.add("Nurlan");
        System.out.println(names);
        System.out.println(names.hashCode());//-793986198

        System.out.println("After cloned Array List");
        ArrayList<String> cloned = (ArrayList<String>) names.clone();
        System.out.println(cloned);
        System.out.println(cloned.hashCode());//-793986198
        //Returns a shallow copy of this ArrayList instance so hashcode is same
    }
}
