package corejavatasks.linkedlist;

import java.util.LinkedList;

public class Task13 {
    //Write a Java program to remove all elements from a linked list.
    public static void main(String[] args) {
        LinkedList<User> users = new LinkedList<>();
        users.add(new User("Kamran", "Babayev"));
        users.add(new User("Qamet", "Memmedli"));
        users.add(new User("Nihad", "Zeynalov"));
        users.add(new User("Azer", "Zeynalov"));
        users.add(new User("Zaur", "Mustafazade"));
        users.forEach(user -> System.out.println(user));
        System.out.println("After remove all users");
        users.removeAll(users);
        System.out.println(users);
    }
}

class User {
    private String name;
    private String surname;

    public User(String name, String surname) {
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
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}