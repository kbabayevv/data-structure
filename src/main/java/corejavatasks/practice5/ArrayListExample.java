package corejavatasks.practice5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(12.5);
        list.add(3.5);
        list.add(4.5);
        System.out.println(multi(list, 2.0));

    }

    public static ArrayList<Double> multi(ArrayList<Double> a, Double b) {

        for (int i = 0; i < a.size(); i++) {
            a.set(i, b * a.get(i));
        }
        return a;
    }
}
