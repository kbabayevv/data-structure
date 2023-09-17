package corejavatasks.practice7;

import java.util.ArrayList;
import java.util.List;

public class Exceptions {
    public static void main(String[] args) {
        try {
            //arithmetic
//            System.out.println(10 / 0);

//            //number format
//            int i = Integer.parseInt("Kamran");
//
//            //null pointer
//            String s = null;
//            System.out.println(s.charAt(0));
//
//            //StringIndexOutOfBounds
//            String s1 = "salam";
//            System.out.println(s.charAt(5));
//
//            //ArrayIndexOutOfBounds
//            int[] arr = new int[5];
//            System.out.println(arr[10]);
//
//            //IndexOutBounds
//            List<String> list =new ArrayList<>();
//            System.out.println(list.get(10));
        }catch (RuntimeException r){
            r.printStackTrace();
        }


    }
}
