package corejavatasks.practice2;

public class PrimeNumberFrom1to50 {
    public static void main(String[] args) {
        //1den 50ye qeder sade edeleri capa ver
        for (int i = 2; i <= 50; i++) {
            boolean b = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println(i);
            }
        }
    }
}
