package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task16 {
    //Write a Java program to join two linked lists.
    public static void main(String[] args) {
        LinkedList<String> finCode = new LinkedList<>();
        finCode.add("6GUVT8PD45");
        finCode.add("6HENT8FG53");
        finCode.add("6VETO8PD57");
        finCode.add("6LOPR8PD89");

        LinkedList<Person> persons = new LinkedList<>();
        persons.add(new Person("Kamran", "Babayev"));
        persons.add(new Person("Nurlan", "Babayev"));
        persons.add(new Person("Orxan", "Rehimov"));
        persons.add(new Person("Mikayil", "Axundov"));

        LinkedList<Object> users = new LinkedList<>();
        users.addAll(finCode);
        users.addAll(persons);
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }


    }
}

class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}