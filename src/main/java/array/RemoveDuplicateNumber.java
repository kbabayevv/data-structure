package array;

import java.util.Arrays;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

    /*
    Write a function which takes integer array
    as a parameter and returns a new integer array
    with unique elements. (remove duplicates)
     */
    public static int[] removeDuplicates(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[i] = 0;
                }
            }
        }
        int[] newArr = new int[arr.length - count];
        System.out.println(Arrays.toString(arr));
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[k] = arr[i];
                k++;
            }
        }

        return newArr;
    }

}
