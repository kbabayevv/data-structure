package corejavatasks.arraylist;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<String> carModel = new ArrayList<>();
        carModel.add("Mercedes-Benz");
        carModel.add("BMW");
        carModel.add("Toyota");//remove this
        carModel.add("Ford");
        carModel.add("KIA");
        carModel.add("Hyundai");
        System.out.println(carModel);
        System.out.println("After remove car model at index 2(element 3)");
        carModel.remove(2);
        System.out.println(carModel);
     }
}
