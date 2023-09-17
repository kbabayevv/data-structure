package corejavatasks.tasks5;

import java.util.Scanner;

public class CheckEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        boolean check = isEven(number);
        System.out.println(check);
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }
}
