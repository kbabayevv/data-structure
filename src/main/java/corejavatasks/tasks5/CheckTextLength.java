package corejavatasks.tasks5;

import java.util.Scanner;

public class CheckTextLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String s3 = sc.nextLine();
        System.out.println(checkCondition(s3));
    }

    public static String checkCondition(String s) {
        if (s.length() < 9 && s.length() > 2) {
            return "OKAY";
        }
        return "Text is false";
    }
}
