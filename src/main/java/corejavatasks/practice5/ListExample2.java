package corejavatasks.practice5;


import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        System.out.println(getSum(List.of(10.0, 20.912, 36.51)));
    }

    public static Double getSum(List<Double> a) {
        Double sum = 0.0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
        }
        return sum;
    }
}
