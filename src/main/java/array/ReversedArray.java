package array;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        array = reverse(array);
        System.out.println("After reversed:");
        System.out.println(Arrays.toString(array));
    }

    public static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
        }
        return newArray;
    }
}
