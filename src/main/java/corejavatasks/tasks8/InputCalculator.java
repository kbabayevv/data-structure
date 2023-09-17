package corejavatasks.tasks8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input count!");
        int inputCount = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < inputCount; i++) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Enter " + (i + 1) + ". parameter!");
                int inputParameter = sc.nextInt();
                sum += inputParameter;
            } catch (InputMismatchException e) {
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / inputCount));
                System.exit(0);
            }

        }
        long average = Math.round((double) sum / inputCount);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
