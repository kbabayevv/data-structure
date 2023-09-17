package corejavatasks.tasks3;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer within 2 <= number <= 20: ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
