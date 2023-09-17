package corejavatasks.practice2;

public class MakeTriangleWithStars {
    public static void main(String[] args) {

//        *
//        **
//        ***
//        ****
//        *****
//        ******


        for (int row = 1; row <= 6; row++) {
            for (int coulmn = 0; coulmn < row; coulmn++) {
                System.out.print("*");
            }
            System.out.println("");
        }

//        ******
//        *****
//        ****
//        ***
//        **
//        *

        for (int row = 1; row <= 6; row++) {
            for (int coulmn = 6; coulmn >= row; coulmn--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
