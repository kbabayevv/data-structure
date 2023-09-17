package corejavatasks.tasks4;

import java.util.Scanner;

public class TestArrSpecificValue {
    public static void main(String[] args) {
        int[] arr = {8, 7, 9, 11, 12, 19};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter specific value: ");
        int value = sc.nextInt();

        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                b = true;
            }
        }
        System.out.println("Specific value is " + b);


    }
}

