package corejavatasks.arraylist;
import java.util.ArrayList;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Kamran"));
        users.add(new User("Orxan"));
        users.add(new User("Nurlan"));
        users.add(new User("Elman"));
        System.out.println(users);
        System.out.println("After updated user at index 1");
        users.set(1, new User("Serxan"));//update an array element
        System.out.println(users);
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}