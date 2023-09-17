package corejavatasks.practice2;

public class SubsEvenNumbersFromOddNumbers {
    public static void main(String[] args) {
        //1 den 50ye qeder cut ededlerden 1 50 ye qeder tek edeleri cix
        int sum = 0;
        int sum1 = 0;
        for (int i = 1; i < 51; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        for (int i = 1; i < 51; i++) {
            if (i % 2 != 0) {
                sum1 = sum1 + i;
            }
        }
        System.out.println(sum - sum1);
    }
}
