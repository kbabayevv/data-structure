package corejavatasks.project;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        PersonsService personsService = new PersonsService();
        personsService.createPerson.accept(new Person("Kamran",
                "Babayev",
                Gender.MALE,
                "+994554217386"));
        personsService.createPerson.accept(new Person("Java",
                "Backend",
                Gender.MALE,
                "+994554217386"));
        System.out.println(personsService.getAllPersons.get());
        System.out.println(personsService.getPersonByName("Java"));
        personsService.deletePersonByNamewithConsumer.accept("Kamran");
        System.out.println(personsService.getAllPersons.get());

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int result = list.stream().reduce(0, (total, currentNumber) -> total + currentNumber);
        System.out.println(result);
        Arrays.sort(args);
        System.out.println(Arrays.toString(args));
    }
}
