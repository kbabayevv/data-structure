package corejavatasks.tasks6;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public static void main(String[] args) {
        Person p = new Person("Kamran", 24, 'M');
        System.out.println(p);
    }

    @Override
    public String toString() {
        return "Student.Behaviour{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
