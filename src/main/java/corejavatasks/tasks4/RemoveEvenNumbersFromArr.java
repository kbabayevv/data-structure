package corejavatasks.tasks4;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveEvenNumbersFromArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] newarr = new int[oddCount];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                newarr[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(newarr));

    }
}
