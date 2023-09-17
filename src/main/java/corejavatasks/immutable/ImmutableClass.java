package corejavatasks.immutable;

public final class ImmutableClass {
    private final String name;
    private final String surname;
    private final Integer age;

    private ImmutableClass(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static ImmutableClass of(String name, String surname, Integer age) {
        return new ImmutableClass(name, surname, age);
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
