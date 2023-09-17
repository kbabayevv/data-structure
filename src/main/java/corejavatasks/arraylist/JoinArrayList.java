package corejavatasks.arraylist;

import java.util.ArrayList;

public class JoinArrayList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Nurlan");
        name.add("Kamran");
        name.add("Terlan");

        ArrayList<String> surname = new ArrayList<>();
        surname.add("Rzayev");
        surname.add("Babayev");
        surname.add("Mirzeyev");

        System.out.println("Names " + name);
        System.out.println("Surnames " + surname);

        ArrayList<String> nameAndSurname = new ArrayList<>();
        nameAndSurname.addAll(name);
        nameAndSurname.addAll(surname);
        System.out.println("Names and Surnames together " + nameAndSurname);
    }
}
