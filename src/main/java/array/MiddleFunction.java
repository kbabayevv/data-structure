package array;

import java.util.Arrays;

public class MiddleFunction {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 9, 15};
        System.out.println(Arrays.toString(middle(myArray)));
    }

    public static int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0];
        }
        int[] middleArray = new int[array.length - 2];
        int index = 1;
        while (index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }
        return middleArray;
    }
}

