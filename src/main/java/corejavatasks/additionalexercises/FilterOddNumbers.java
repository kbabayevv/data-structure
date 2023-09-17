package corejavatasks.additionalexercises;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class FilterOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(filterOddNumbers(list));
    }

    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
    }


}
