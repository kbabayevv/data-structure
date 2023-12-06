package corejavatasks.tasks4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArr {
    public static void main(String[] args) {
        Integer[] arr = {1, 4, 3, 2, 5, 6};
        int starIndex = 0;
        int lastIndex = arr.length - 1;
        while (starIndex < lastIndex) {
            int temp = arr[starIndex];
            arr[starIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
            starIndex++;
            lastIndex--;
        }
        System.out.println(Arrays.toString(arr));
        //2nd way
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr));

    }
}
