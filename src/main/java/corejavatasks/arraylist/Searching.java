package corejavatasks.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        ArrayList<String> carModel = new ArrayList<>();
        carModel.add("Mercedes");
        carModel.add("BMW");
        carModel.add("Toyota");
        carModel.add("Ford");
        carModel.add("KIA");
        carModel.add("Hyundai");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element which you want to search !");
        String element = sc.nextLine();

        if (carModel.contains(element)) {
            System.out.println("Found element at index " + carModel.indexOf(element));
        } else {
            System.out.println("There is no such element");
        }
    }
}
