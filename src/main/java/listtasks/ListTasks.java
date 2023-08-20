package listtasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Task1 {
    public static void main(String[] args) {
        System.out.println(returnFirstElement(List.of("Java", "C#", "C++", "PHP", "Python")));
    }

    public static String returnFirstElement(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return "";
    }
}

class Task2 {
    public static void main(String[] args) {
        System.out.println(returnLastElement(List.of("Java", "C#", "C++", "PHP", "Python")));
    }

    public static String returnLastElement(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        return "";
    }
}

class Task3 {
    public static void main(String[] args) {
        System.out.println(getSum(List.of(4.5, 9.8, 3.7, 5.3)));
    }

    public static Double getSum(List<Double> list) {
        Double sum = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}

class Task4 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(4.5);
        list.add(3.2);
        list.add(8.3);
        System.out.println(returnMultipliedList(list, 2.0));

    }

    public static List<Double> returnMultipliedList(List<Double> list, Double number) {

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * number);
        }
        return list;
    }
}

class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(reversedList(list));
    }

    public static List<Integer> reversedList(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }
}