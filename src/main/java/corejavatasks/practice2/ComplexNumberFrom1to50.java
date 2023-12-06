package corejavatasks.practice2;

public class ComplexNumberFrom1to50 {
    public static void main(String[] args) {
        //1 den 50 ye qeder ancaq murekkeb ededleri capa ver
        for (int i = 4; i <= 50; i++) {
            boolean b = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = true;
                    break;
                }
            }
            if (b) {
                System.out.println(i);
            }
        }
    }
}

