package corejavatasks.practice5.iheritance;

public class Student extends Person {
    Integer scholarship;

    public Student(String name, String surname, Integer scholarship) {
        super(name, surname);
        this.scholarship = scholarship;
    }

    public static void main(String[] args) {
        Student s = new Student("Kamran","Babayev",100);
        System.out.println(s);
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getSurname() + " " + this.scholarship;
    }
}
