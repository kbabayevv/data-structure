package corejavatasks.additionalexercises;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {

    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        } else if (str1.length() != str2.length()) {
            return false;
        } else if (str1.equals(str2)) {
            return true;
        } else {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            char[] chr1 = str1.toCharArray();
            char[] chr2 = str2.toCharArray();
            Arrays.sort(chr1);
            Arrays.sort(chr2);
            for (int i = 0; i < chr1.length; i++) {
                for (int j = 0; j < chr2.length; j++) {
                    if (chr1[i] == chr2[j]) {
                        return true;
                    } else return false;
                }
            }
        }
        return false;
    }
}
