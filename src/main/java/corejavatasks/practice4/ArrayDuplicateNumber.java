package corejavatasks.practice4;

public class ArrayDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printDuplicateNumber(arr);

    }

    public static void printDuplicateNumber(int[] arr) {
        boolean b = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    b = false;
                }
            }
        }
        if (b) {
            System.out.println("Duplicate number not found");
        }
    }
}
