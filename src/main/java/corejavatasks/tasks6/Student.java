package corejavatasks.tasks6;

import java.util.Random;

public class Student {
    private String name;
    private int age;
    private int grade;
    private Double averageScore;

    public static void main(String[] args) {

        Student s = new Student("Kamran", 24, 13);
        System.out.println(s);

    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.averageScore = calculateAverage();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public double calculateAverage() {
        Random random = new Random();

        if (grade >= 1 && grade <= 5) {
            return random.nextDouble() * 10 + 90;
        } else if (grade >= 6 && grade <= 8) {
            return random.nextDouble() * 9 + 80;
        } else if (grade >= 9 && grade <= 12) {
            return random.nextDouble() * 9 + 70;
        } else System.out.println("Grade must be between 1-12!");
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", averageScore=" + averageScore +
                '}';
    }
}
