package array;

public class PrintPairs {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5};
        printPairs(array);
    }

    public static void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i] + "" + array[j] + ",");
            }
            System.out.println();
        }
    }
}
