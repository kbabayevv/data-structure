package corejavatasks.tasks4;

import java.util.Arrays;

public class SecondSmallestNumberInArr {
    public static void main(String[] args) {
        int[] arr = {10, 10, 30, 89, 75, 3, 36, 10, 100, 100};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = 0;
        while (arr[index] == arr[0]) {
            index++;
        }
        System.out.println("Second smallest value: " + arr[index]);
    }
}
