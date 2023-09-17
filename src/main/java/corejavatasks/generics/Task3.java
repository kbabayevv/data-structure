package corejavatasks.generics;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> names = List.of("Kamran", "Nurlan", "Orxan");
        System.out.println(findIndexOfTargetedElement(names, "Serxan"));
    }

    public static <T> int findIndexOfTargetedElement(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
