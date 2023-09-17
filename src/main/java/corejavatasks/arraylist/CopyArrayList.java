package corejavatasks.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> age1 = new ArrayList<>();
        age1.add(24);
        age1.add(26);
        age1.add(49);
        age1.add(53);
        ArrayList<Integer> age2 = new ArrayList<>();
        age2.add(15);
        age2.add(23);
        age2.add(26);
        age2.add(44);

        Collections.copy(age2, age1);
        System.out.println("age1 list " + age1);
        System.out.println("Copy age1 to age2\nAfter copy:");
        System.out.println("age2 list " + age2);

        System.out.println(age1.hashCode());//1665063
        System.out.println(age2.hashCode());//1665063
    }
}
