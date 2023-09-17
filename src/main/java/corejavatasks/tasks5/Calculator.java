package corejavatasks.tasks5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            double a = sc.nextDouble();
            System.out.println("Enter b number:");
            double b = sc.nextDouble();
            switch (i) {
                case 0:
                    System.out.println("Sum is " + sum(a, b));
                    break;
                case 1:
                    System.out.println("Subtraction is " + subtraction(a, b));
                    break;
                case 2:
                    System.out.println("Multiplying is " + multiply(a, b));
                    break;
                case 3:
                    System.out.println("Division is " + division(a, b));
                    break;
            }
        }


    }

    public static double sum(double a, double b) {

        return a + b;
    }

    public static double subtraction(double a, double b) {

        return a - b;
    }

    public static double multiply(double a, double b) {

        return a * b;
    }

    public static double division(double a, double b) {

        return a / b;
    }
}
