package array;

import java.util.Arrays;

public class BestScore {
    public static void main(String[] args) {
        int[] arr = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        System.out.println(Arrays.toString(findTopTwoScores(arr)));
    }

    /*
    Given an array, write a function to get first,
    second best scores from the array
    and return it in new array.
     */
    public static int[] findTopTwoScores(int[] array) {
        int[] bestScores = new int[2];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        bestScores[0] = max;

        int max2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max2 < array[i] && array[i] < max) {
                max2 = array[i];
            }
        }
        bestScores[1] = max2;
        return bestScores;
    }
}
