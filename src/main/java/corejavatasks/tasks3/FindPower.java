package corejavatasks.tasks3;

import java.util.Scanner;

public class FindPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();
        System.out.println("Enter power: ");
        int power = sc.nextInt();

        double powered = number;
        for (int i = 1; i < power; i++) {
            powered *= number;
        }
        System.out.println(number + " raised to the power of " + power + " = " + powered);
    }
}
