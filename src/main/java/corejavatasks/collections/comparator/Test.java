package corejavatasks.collections.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kamran", 24, 1L));
        students.add(new Student("Nurlan", 26, 5L));
        students.add(new Student("Ziya", 24, 41L));
        students.add(new Student("Taleh", 23, 95L));
        students.add(new Student("Anar", 16, 53L));
        students.add(new Student("Terlan", 17, 12L));
        System.out.println("Original List:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("After sorting List by age:");
        Collections.sort(students, new AgeComparator());
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("After sorting List by name:");
        Collections.sort(students, new NameComparator());
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
