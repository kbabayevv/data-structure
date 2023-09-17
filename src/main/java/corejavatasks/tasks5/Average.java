package corejavatasks.tasks5;

public class Average {
    public static void main(String[] args) {
        findAverage(9.7, 5.6, 3.4);
    }

    public static void findAverage(double a, double b, double c) {
        double average = (a + b + c) / c;
        System.out.println("Average of numbers is " + average);
    }
}
