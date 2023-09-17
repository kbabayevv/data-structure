package corejavatasks.tasks4;

import java.util.Scanner;

public class AverageValueArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of arr elements: ");
        int count = sc.nextInt();
        int[] arr = new int[count];
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sc = new Scanner(System.in);
            System.out.println("Enter arr value of " + i);
            int value = sc.nextInt();
            arr[i] = value;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = sum / count;
        System.out.println("Average value of array elements = " + average);


    }
}
