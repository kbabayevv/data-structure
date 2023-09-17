package corejavatasks.tasks5;

import java.util.Scanner;

public class FindVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String a = sc.nextLine();
        int i = countAllVowels(a);
        System.out.println("Count of all vowels in this text = " + i);
    }

    public static int countAllVowels(String s) {
        char[] s1 = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
        int vowel = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s1.length; j++) {
                if (s.charAt(i) == s1[j]) vowel++;
            }
        }
        return vowel;
    }
}

