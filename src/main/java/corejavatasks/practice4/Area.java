package corejavatasks.practice4;

import static java.lang.Math.*;

public class Area {
    public static void main(String[] args) {
        System.out.println(area(-1.0));
        System.out.println(area(5.0));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println(area(-1.0, -4.0));
    }

    public static Double area(Double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return PI * pow(radius, 2);
    }

    public static Double area(Double length, Double width) {
        if (length < 0 || width < 0) {
            return -1.0;
        }
        return length * width;
    }
}
