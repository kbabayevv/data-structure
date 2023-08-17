package array;

public class SumAndProductOfArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5};
        sumAndProduct(array);
    }

    public static void sumAndProduct(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            product *= array[i];
        }
        System.out.println("Sum of elements is " + sum + "," + " Product of elements is " + product);
    }

}
