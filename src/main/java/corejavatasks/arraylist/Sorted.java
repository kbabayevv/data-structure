package corejavatasks.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Sorted {
    public static void main(String[] args) {
        ArrayList<Double> salary = new ArrayList<>();
        salary.add(1200.0);
        salary.add(2500.5);
        salary.add(1400.85);
        salary.add(1750.8);
        salary.add(1500.36);
        salary.add(900.80);
        salary.add(3200.5);

        System.out.println(salary);
        Collections.sort(salary);
        System.out.println("After sorted Array List from min to max");
        System.out.println(salary);
    }
}
