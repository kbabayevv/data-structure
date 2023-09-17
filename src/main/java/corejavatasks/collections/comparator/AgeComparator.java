package corejavatasks.collections.comparator;

import java.util.Comparator;
import java.util.Objects;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (Objects.equals(o1.getAge(), o2.getAge())) {
            return 0;
        } else if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        return -1;
    }
}
