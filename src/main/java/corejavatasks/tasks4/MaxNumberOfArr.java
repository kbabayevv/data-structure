package corejavatasks.tasks4;

public class MaxNumberOfArr {
    public static void main(String[] args) {
        int[] arr = {15, 44, 18, 23, 5, 61};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
