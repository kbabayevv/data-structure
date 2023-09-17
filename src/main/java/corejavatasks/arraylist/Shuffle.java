package corejavatasks.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {
        ArrayList<String> alphabet = new ArrayList<>();
        alphabet.add("A a");
        alphabet.add("B b");
        alphabet.add("C c");
        alphabet.add("D d");
        alphabet.add("E E");
        alphabet.add("F f");
        System.out.println("List before shuffling: " + alphabet);
        Collections.shuffle(alphabet);
        System.out.println("List after shuffling: " + alphabet);
    }
}
