package corejavatasks.practice4;

public class EqualityPrinter {
    public static void main(String[] args) {
        printEquality(0, -5, 6);
        printEquality(5, 5, 5);
        printEquality(1, 2, 3);
        printEquality(1, 1, 2);

    }

    public static void printEquality(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid value");
        } else if (a == b && a == c && c == b) {
            System.out.println("All numbers are equal");
        } else if (a != b && a != c && c != b) {
            System.out.println("All numbers are different");
        } else System.out.println("Neither all are equal or different");
    }



}
