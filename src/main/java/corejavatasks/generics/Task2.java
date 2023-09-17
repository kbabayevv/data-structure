package corejavatasks.generics;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sumEven(numbers));
        System.out.println(sumOdd(numbers));
    }

    public static int sumEven(List<? extends Number> list) {
        int sum = 0;
        for (Number number : list) {
            if (number.intValue() % 2 == 0) {
                sum += number.intValue();
            }
        }
        return sum;
    }

    public static int sumOdd(List<? extends Number> list) {
        int sum = 0;
        for (Number number : list) {
            if (number.intValue() % 2 != 0) {
                sum += number.intValue();
            }
        }
        return sum;
    }
}
