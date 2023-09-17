package corejavatasks.practice8;

import java.math.BigDecimal;

public class Student {
    public static void main(String[] args) {
        Student s = new Student("Kamran",BigDecimal.valueOf(100),new Teacher("Huseyn",BigDecimal.valueOf(1000)));
        System.out.println(s);
    }
    String name;
    BigDecimal scholarship;
    Teacher t;

    public Student(String name, BigDecimal scholarship, Teacher t) {
        this.name = name;
        this.scholarship = scholarship;
        this.t = t;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", scholarship=" + scholarship +
                ", t=" + t +
                '}';
    }
}

class Teacher {
    String name;
    BigDecimal salary;

    public Teacher(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}