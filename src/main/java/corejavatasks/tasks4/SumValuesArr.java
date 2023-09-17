package corejavatasks.tasks4;

import java.util.Scanner;

public class SumValuesArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of arr elements: ");
        int count = sc.nextInt();
        int[] arr = new int[count];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sc = new Scanner(System.in);
            System.out.println("Enter arr value of " + i);
            int value = sc.nextInt();
            arr[i] = value;
            if (count > 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum values of arr = " + sum);


    }
}
