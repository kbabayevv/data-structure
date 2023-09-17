package corejavatasks.comparable_comparator;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    public String name;
    public Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        if (Objects.equals(this.age, o.age)) {
            return 0;
        } else if (this.age > o.age) {
            return 1;
        }
        return -1;
    }
}
