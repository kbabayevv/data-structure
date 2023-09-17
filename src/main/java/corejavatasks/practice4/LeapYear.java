package corejavatasks.practice4;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1600));
        //Leap year has 366 days
        //Which year has 365 days is not leap year
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                return true;
            else
                return false;
        }
        return false;
    }
}
