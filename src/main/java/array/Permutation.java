package array;

public class Permutation {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 1, 2, 3, 4};
        System.out.println(permutation(array1, array2));
    }

    public static boolean permutation(int[] array1, int[] array2) {
        int sum1 = 0;
        int multi1 = 1;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            multi1 *= array1[i];
        }

        int sum2 = 0;
        int multi2 = 1;
        for (int i = 0; i < array1.length; i++) {
            sum2 += array2[i];
            multi2 *= array2[i];
        }

        return ((sum1 == sum2) && (multi1 == multi2));
    }

}
