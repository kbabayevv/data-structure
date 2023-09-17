package corejavatasks.collections.enummap;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public class EnumMapTask {
    public static void main(String[] args) {
        //Create an EnumMap that maps days of the week (an enum) to
        // their corresponding working hours (an integer value). Fill in the map with
        // values for each day of the week and then print the working hours for a specific day.
        Map<DayOfWeek, Integer> workingHours = new EnumMap<>(DayOfWeek.class);
        workingHours.put(DayOfWeek.MONDAY, 10);
        workingHours.put(DayOfWeek.TUESDAY, 8);
        workingHours.put(DayOfWeek.WEDNESDAY, 11);
        workingHours.put(DayOfWeek.THURSDAY, 9);
        workingHours.put(DayOfWeek.FRIDAY, 7);
        workingHours.put(DayOfWeek.SATURDAY, 12);
        workingHours.put(DayOfWeek.SUNDAY, 6);

        for (Entry<DayOfWeek, Integer> entry : workingHours.entrySet()) {
            DayOfWeek key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Working hours at " + key + " " + value + " hours");
        }
    }
}
