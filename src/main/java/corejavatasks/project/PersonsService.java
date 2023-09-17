package corejavatasks.project;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static corejavatasks.project.ApplicationConstant.persons;


public class PersonsService {
    public Consumer<Person> createPerson = person -> persons.add(person);
    public Supplier<List<Person>> getAllPersons = () -> persons;

    public List<Person> getPersonByName(String name) {
        return persons.stream().filter(person -> name.equals(person.getName())).collect(Collectors.toList());
    }

    public Function<String, List<Person>> getPersonByNameWithFunction = (name) -> persons.stream()
            .filter(person -> name.equals(person.getName())).collect(Collectors.toList());


    public Consumer<String> deletePersonByNamewithConsumer = name -> {
        var foundedPerson =
                persons.stream().filter(person -> name.equals(person.getName())).findFirst().get();
        persons.remove(foundedPerson);
    };
}
