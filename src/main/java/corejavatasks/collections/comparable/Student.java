package corejavatasks.collections.comparable;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private Integer age;
    private Long id;

    public Student(String name, Integer age, Long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (Objects.equals(this.id, o.id)) {
            return 0;
        } else if (this.id > o.id) {
            return 1;
        }
        return -1;
    }
}
