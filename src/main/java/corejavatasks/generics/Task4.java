package corejavatasks.generics;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");
        List<Integer> ages = List.of(24, 56, 42, 23);
        System.out.println(reversedOrder(fruits));
        System.out.println(reversedOrder(ages));
    }

    public static <T> List<T> reversedOrder(List<T> list) {
        List<T> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
