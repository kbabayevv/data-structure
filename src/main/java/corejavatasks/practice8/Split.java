package corejavatasks.practice8;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(",");
        if (arr.length > 1) {
            getMult(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        } else getMult(Integer.parseInt(arr[0]));

    }

    public static void getMult(int a) {
        System.out.println(2 * a);
    }

    public static void getMult(int a, int b) {
        System.out.println(a * b);
    }
}
