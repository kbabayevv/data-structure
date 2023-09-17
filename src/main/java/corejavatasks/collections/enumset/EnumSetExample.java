package corejavatasks.collections.enumset;

import java.time.DayOfWeek;
import java.util.EnumSet;
import java.util.Set;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;

public class EnumSetExample {
    //Create an EnumSet containing the days of the week
    // that are considered weekends. Then, use this EnumSet
    // to filter out the working days from a list of tasks.
    public static void main(String[] args) {
        Set<DayOfWeek> weekends = EnumSet.of(SATURDAY, SUNDAY);
        System.out.println("Weekend Days: " + weekends);
        Task[] tasks = {
                new Task("Task 1", DayOfWeek.MONDAY),
                new Task("Task 2", DayOfWeek.TUESDAY),
                new Task("Task 3", DayOfWeek.WEDNESDAY),
                new Task("Task 4", DayOfWeek.THURSDAY),
                new Task("Task 5", DayOfWeek.FRIDAY),
                new Task("Task 6", DayOfWeek.SATURDAY),
                new Task("Task 7", DayOfWeek.SUNDAY)
        };

        // Filter out the working days from the tasks
        System.out.println("Working Days Tasks:");
        for (Task task : tasks) {
            if (!weekends.contains(task.getDay())) {
                System.out.println(task);
            }
        }
    }
}
