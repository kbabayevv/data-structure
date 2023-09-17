package corejavatasks.practice2;

public class SumComplexNUmberFrom1To50 {
    public static void main(String[] args) {
        //1den 50ye qeder murekkebleri topla
        int sum = 0;
        for (int i = 4; i < 51; i++) {


            boolean b = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = true;
                    break;
                }
            }
            if (b) {
                sum += i;
            }
        }
        System.out.println(sum);


    }
}

