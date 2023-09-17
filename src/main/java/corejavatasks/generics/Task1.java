package corejavatasks.generics;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(compareArrays(arr1, arr2));
        StringBuilder[] sb1 = {new StringBuilder("A"), new StringBuilder("B")};
        StringBuilder[] sb2 = null;
        System.out.println(compareArrays(sb1, sb2));
    }

    public static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        if (arr1 == null || arr2 == null) {
            return false;
        } else if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
