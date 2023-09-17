package corejavatasks.comparable_comparator;

import java.util.Comparator;
import java.util.Objects;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (Objects.equals(o1.age, o2.age)) {
            return 0;
        } else if (o1.age > o2.age) {
            return 1;
        }
        return -1;
    }


}
