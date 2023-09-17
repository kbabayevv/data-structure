package corejavatasks.practice4;

public class BarkDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 23));
        System.out.println(shouldWakeUp(true, 9));
        System.out.println(shouldWakeUp(false, 23));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
