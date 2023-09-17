package corejavatasks.practice5;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        System.out.println(returnLastElement(List.of("Kamran", "Nurlan", "Orxan")));
    }

    public static String returnLastElement(List<String> a) {
        if (a != null && !a.isEmpty()) {
            return a.get(a.size() - 1);
        }
        return "";
    }
}
