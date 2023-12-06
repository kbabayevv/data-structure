package corejavatasks.tasks4;

import java.util.Arrays;

public class SecondLargestNumberInArr {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 89, 75, 57, 36, 71, 100, 100};
        Arrays.sort(arr);
        int index = arr.length - 1;
        while (arr[index] == arr[arr.length - 1]) {
            index--;
        }
        System.out.println("Second largest value: " + arr[index]);
    }
}
