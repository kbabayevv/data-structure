package array;

public class IsUnique {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        System.out.println(isUnique(intArray)); // true
        int[] intArray1 = {1, 2, 3, 1};
        System.out.println(isUnique(intArray1)); // false
        int[] intArray2 = {1, 2, 3, 4};
        System.out.println(isUnique(intArray2)); // true
        int[] intArray3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(isUnique(intArray3)); // false
    }

    public static boolean isUnique(int[] intArray) {
        boolean b = true;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    b = false;
                }
            }
        }
        return b;
    }
}
