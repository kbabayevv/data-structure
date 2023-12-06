package corejavatasks.tasks4;

import java.util.Scanner;

public class FindArrIndex {
    public static void main(String[] args) {
        int[] arr = {5, 6, 9, 11, 80};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element: ");
        int element = sc.nextInt();

        boolean b = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Index of " + element + " is " + i);
                b = false;
                break;
            }
        }
        if (b) {
            System.out.println("Index is not found");
        }
    }
}

