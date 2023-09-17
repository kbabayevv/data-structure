package corejavatasks.practice6;

public class User {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

class Main {
    public static void main(String[] args) {
        var u = new User();
        u.setName("Kamran");
        u.setSurname("Babayev");
        printObject(u);
    }

    public static void printObject(User u) {
        System.out.println(u.getName() + " " + u.getSurname());
    }
}
