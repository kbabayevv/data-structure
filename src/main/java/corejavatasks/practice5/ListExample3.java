package corejavatasks.practice5;

import java.util.List;

public class ListExample3 {
    public static void main(String[] args) {
        System.out.println(returnFirstElement(List.of("Kamran", "Nurlan", "Orxan")));
    }

    public static String returnFirstElement(List<String> a) {
        if (a != null && !a.isEmpty()) {
            return a.get(0);
        }
        return "";
    }
}
