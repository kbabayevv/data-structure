package corejavatasks.practice4;

public class EqualsByThree {
    public static void main(String[] args) {
        System.out.println(checkThreeLastDecimal(3.1256, 4.1255));
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));


    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        a = a * 1000;
        b = b * 1000;
        return (int) a == (int) b;
    }

    public static boolean checkThreeLastDecimal(double a, double b) {
        a = a * 1000;
        b = b * 1000;
        if ((int) a % 1000 == (int) b % 1000) {
            return true;
        }
        return false;
    }

}
