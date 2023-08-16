package array;

public class MaxProductOfTwoIntegers {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30, 40, 50};
        System.out.println(maxProduct(intArray)); // (40,50)
    }

    public static String maxProduct(int[] intArray) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > maxProduct) {
                    maxProduct = intArray[i] * intArray[j];
                    pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }
}
