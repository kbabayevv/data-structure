package corejavatasks.tasks4;

public class MinNumberOfArr {
    public static void main(String[] args) {
        int[] arr = {15, 44, 18, 23, 5, 61};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
