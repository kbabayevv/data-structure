package corejavatasks.tasks5;

public class CompareNumbers {
    public static void main(String[] args) {
        findSmallestNumber(1, 3, 5);
    }

    public static void findSmallestNumber(double a, double b, double c) {
        if (a > c && b > c) {
            System.out.println("The smallest number is " + c);
        } else if (a > b && c > b) {
            System.out.println("The smallest number is " + b);
        } else if (b > a && c > a) {
            System.out.println("The smallest number is " + a);
        } else if (a == b && a > c) {
            System.out.println("The smallest number is " + c);
        } else if (a == b && a < c) {
            System.out.println("The smallest number is " + a);
        } else if (a == c && c > b) {
            System.out.println("The smallest number is " + b);
        } else if (a == c && c < b) {
            System.out.println("The smallest number is " + c);
        } else if (b == c && c > a) {
            System.out.println("The smallest number is " + a);
        } else if (b == c && c < a) {
            System.out.println("The smallest number is " + c);
        } else System.out.println("The numbers are equal");
    }
}
