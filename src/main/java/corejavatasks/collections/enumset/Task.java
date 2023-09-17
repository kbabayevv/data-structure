package corejavatasks.collections.enumset;

import java.time.DayOfWeek;

public class Task {
    private String name;
    private DayOfWeek day;

    public Task(String name, DayOfWeek day) {
        this.name = name;
        this.day = day;
    }

    public DayOfWeek getDay() {
        return day;
    }

    @Override
    public String toString() {
        return name + " - " + day;
    }
}
