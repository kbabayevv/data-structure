package corejavatasks.tasks3;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a factorial number: ");
        int number = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(number + "! = " + factorial);
    }
}




